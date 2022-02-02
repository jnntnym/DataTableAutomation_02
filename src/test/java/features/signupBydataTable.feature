Feature: Sign up new account from DataTable
  / In a single execution, Scenario is executed only once whereas Scenario outline (For similar data trace)
  //can be executed multiple times depending upon the data provided as Example.
  @signup
  Scenario: Signup with valid credentials using DataTable
    Given Users in a TalentTek HomePage
    When User clicked on Create new account button
    Then Users should be navigate to Sign Up page
    Then Users fill out the information as below
      | FirstName | LastName | Email          | Password | ConfirmPassword | Month | Day | Year |
      | Jony      | Nayeem   | abc12@gmail.com | xyz123   | xyz123          | Feb   | 21  | 2010 |
    And user select male as gender
    And user click on checkbox for agreement
    When user click on create new account button
    Then User should able to Create new Account successfully

  @smoke
  Scenario: Signup with valid credentials using DataTable
    Given Second Users in a TalentTek HomePage
    When SecondUser clicked on Create new account button
    Then SecondUsers should be navigate to Sign Up page
    Then SecondUsers fill out the information as below
      | FirstName | LastName | Email           | Password | ConfirmPassword | Month | Day | Year |
      | Jon       | Nay      | abc21@gmail.com | xyz123   | xyz123          | Mar   | 21  | 2012 |
    And Second select male as gender
    And Second user click on checkbox for agreement
    When Second user click on create new account button
    Then Second User should able to Create new Account successfully