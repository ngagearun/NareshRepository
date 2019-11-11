Feature: Calculating the HomeLoan for Mortagegcalculator

@regressiontesting
Scenario Outline: Home Loan calculation

Given the user is on mortagecalculator homepage
Then enter the <"homevalue"> <"downpayment"> <"inteestrate"> details
And click on calculate button

Examples:

|homevalue|downpayment|inteestrate|
|30000|4000|5|
|40000|5000|6|
|50000|6000|7|


    