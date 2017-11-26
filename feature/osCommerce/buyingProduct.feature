Feature: Buying a product
In order to buy a product
As a registered customer with valid user name and password
I want to login to the oscommerce application’s catalog page, select a product and add the product to the shopping cart before check out.
Scenario:  Add selected product to the shopping cart
Given the user is visiting catalog page
When user click on a product
And user click on add to cart
And user enters the Cart content page
And select quantity of the product, continue
And select payment method, continue
And receive order confirmation
Then select Pay Now
