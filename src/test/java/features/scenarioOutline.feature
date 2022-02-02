Feature: SignUp test
@smoke
Scenario Outline: Signup with valid credentials using examples
  Given User in a Homepage
  When User able to click on New Account button
  Then User should land on Sign Up page
  Then User enter first name as "<FirstName>"
  Then User enter last name as "<LastName>"
  Then User enter email as "<Email>"
  Then User enter password as "<Password>"
  Then User enter confirm password as "<ConfirmPassword>"
  Then User enter month as "<Month>"
  Then User enter day as "<Day>"
  Then User enter year as "<Year>"
  And User select the radio button for Gender
  And User click on checkbox for Agreement
  When User click on Create New account
  Then User should be able to Create account successfully
  Examples:
    | FirstName | LastName | Email          | Password | ConfirmPassword | Month | Day | Year |
    | Jon       | Nay      | ab02@gmail.com | xyz123   | xyz123          | Mar   | 21  | 2012 |
    | Jony      | Nam      | ac01@gmail.com | xyz123   | xyz123          | Apr   | 20  | 2009 |

