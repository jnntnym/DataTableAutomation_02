Feature: Sign up new account from DataTable
  @signup
  Scenario: Signup with valid credentials using DataTable
    Given Users in a TalentTek HomePage
    When User clicked on Create new account button
    Then Users should be navigate to Sign Up page
    Then Users fill out the information as below
      | FirstName | LastName | Email         | Password | ConfirmPassword | Month | Day | Year |
      | Md.       | Nayeem   | abc@gmail.com | xyz123   | xyz123          | Feb   | 21  | 2010 |
    And user select male as gender
    And user click on checkbox for agreement
    When user click on create new account button
    Then User should able to Create new Account successfully
