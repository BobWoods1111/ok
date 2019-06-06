Feature: Amazon Website Testing

@amazon
Scenario Outline: Trying to search
Given I opened amazon homepage
When I Landed on the splash screen
Then Search for "<whatToFind>" and landed on next page
And sort by customer rating and landed on next page
Then close the browser

Examples:
|whatToFind|
|bluetooth headphones|
|bluetooth earbuds|
|bluetooth around the neck headphones|
