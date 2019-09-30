Feature: Item in cart

Scenario: User move to cart without adding any item to it
Given User has registered into TestMeApp
When User search a particular product like Headphone
And try to procced to payment without adding any item in the cart
Then TestMeapp doesn't display the cart item 

