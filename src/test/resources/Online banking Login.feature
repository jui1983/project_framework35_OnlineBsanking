@Smoke @Regression
Feature: Login function for Smarttech online Banking
description

@Positive_Scenario @TC_LP-18
Scenario: Login function test with valid credential.
Given open the browser
And Go to application
When Put valid user name
And Put valid password
And Click sign in
Then Logout button should visible for successfull login 

@Negative_Scenario @TC_LP-19
Scenario: Login function test with invalid credential.
Given open the browser
And Go to application
When Put invalid user name
And Put invalid Password
And Click sign in
Then Logout button should not visible for successfull login 
