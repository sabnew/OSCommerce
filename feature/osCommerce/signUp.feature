Feature: Sign up Account Creation
In order to become a New Customer/New Site Member
As a site visitor
I want to go to the Login Page, enter  gender, first name, last name, date of birth, email address, company name, street address, suburb, post code, city, state, province, country,  telephone no, fax no and password to register/create an account for the site.

Scenario:  User with valid information

Given the user is visiting Log in page
When user click on continue under New Customer
And user enters gender, first name, last name, date of birth, email address, company name, street address, suburb, post code, city, state, province, country,  telephone no, fax no and password
And user click continue
Then user receives congratulation and confirmation message of successful registration

