package serenity.steps.StarWars;

import core.ws.AbstractWsConfiguration;
import dto.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import javax.ws.rs.GET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class StarWarsApiSteps extends AbstractWsConfiguration {

    private static final String SERVER_BASE_URL = "https://swapi.co/api";
    private static final String ALL_USERS_PATH = "/people/";
    private static final String LUKE = "/people/1";
    private static final String FILM_1 = "/films/2";
    private static final String FILM_2 = "/films/6";
    private static final String FILM_3 = "/films/3";
    private static final String FILM_4 = "/films/1";
    private static final String FILM_5 = "/films/7";

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

       public StarWarsFilms getFilm1() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return  RestAssured.get(FILM_1).as(StarWarsFilms.class);
       }

       public StarWarsFilms getFilm2() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return RestAssured.get(FILM_2).as(StarWarsFilms.class);
       }

       public StarWarsFilms getFilm3() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return RestAssured.get(FILM_3).as(StarWarsFilms.class);
    }

       public StarWarsFilms getFilm4() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return RestAssured.get(FILM_4).as(StarWarsFilms.class);
    }

       public StarWarsFilms getFilm5() {
        RestAssured.baseURI = SERVER_BASE_URL;
        return RestAssured.get(FILM_5).as(StarWarsFilms.class);
    }


    public static void main(String[] args) {
        final StarWarsApiSteps steps = new StarWarsApiSteps();
        final LukeSkywalker lukeSkywalker = steps.getUser();
        String[] films = lukeSkywalker.getFilms();
        for (String item : films) {
            StarWarsFilms film1 = get("https://swapi.co/api/films/2/").as(StarWarsFilms.class);
            film1.getTitle();

            StarWarsFilms film2 = get("https://swapi.co/api/films/6/").as(StarWarsFilms.class);
            film2.getTitle();

            StarWarsFilms film3 = get("https://swapi.co/api/films/3/").as(StarWarsFilms.class);
            film3.getTitle();

            StarWarsFilms film4 = get("https://swapi.co/api/films/1/").as(StarWarsFilms.class);
            film4.getTitle();

            StarWarsFilms film5 = get("https://swapi.co/api/films/7/").as(StarWarsFilms.class);
            film5.getTitle();
        }
        lukeSkywalker.setFilms(films);
        Arrays.toString(films);
        System.out.print(films);
    }
}