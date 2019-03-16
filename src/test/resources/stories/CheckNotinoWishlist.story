Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify is select item are in the Whishlist

Given user open Notino main page, using following url: 'https://www.notino.ua'
When user types search parameter to search bar 'SpiriTime Flower Time'
And user clicks 'Add to Wishlist' button
And user goes to Wishlist
Then selected item 'SpiriTime Flower Time' is in the Wishlist