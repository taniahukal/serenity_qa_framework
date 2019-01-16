Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify is select item are in the Whishlist

Given user is open Rozetka main page, using following url: 'https://makeup.com.ua/'
When user types '<inputWorld>' in search bar
And user picks up one of the items
And user clicks 'Add to Whishlist' button
And user goes to Whishlist page
Then selected item 'Huawei Mate 20 Pro' is in the Whishlist