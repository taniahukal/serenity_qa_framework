package serenity.steps.StarWars;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import core.ws.AbstractWsConfiguration;
import dto.AllStarWarsUsers;
import dto.LukeSkywalker;
import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;
import utils.JsonUtils;

import java.util.List;

import static io.restassured.RestAssured.given;

public class StarWarsApiSteps extends AbstractWsConfiguration {

    private static final String SERVER_BASE_URL = "https://swapi.co/api";
    private static final String ALL_USERS_PATH = "/people/";
    private static final String LUKE = "/people/1";

    @Step
    public AllStarWarsUsers getAllUsers() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return RestAssured.get(ALL_USERS_PATH).as(AllStarWarsUsers.class);
    }

  //     public static void main(String[] args) {
  //        final StarWarsApiSteps steps = new StarWarsApiSteps();
  //         final AllStarWarsUsers allUsers = steps.getAllUsers();
  //     }

       @Step
    public LukeSkywalker getUser() {
           RestAssured.baseURI = SERVER_BASE_URL;
           return RestAssured.get(LUKE).as(LukeSkywalker.class);
       }

    public static void main(String[] args) {
        final StarWarsApiSteps steps = new StarWarsApiSteps();
        final LukeSkywalker lukeSkywalker = steps.getUser();
        final String lukeS = JsonUtils.toJson(lukeSkywalker);
        final JsonParser parser = new JsonParser();
        final JsonObject root = parser.parse(lukeS).getAsJsonObject();
        final String films = root.get("films").toString();
    }


}