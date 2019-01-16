Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify Sportcheck helpful links are displayed correctly

Given user open Sportcheck main page, using following url: 'https://www.sportchek.ca/'
When user scrolls the page
Then next helpful links should be displayed: 'Store Locator, Store Locations, Careers, Shop Sportchek.ca, Shop Clearance Deals, Boxing Day Sale, Chek Advice, Gift Cards, Find What Moves You, About Us, Jumpstart, Join Our Affiliate Program, Retail Store Services, Shop by Appointment'