Feature: Webdriver feature

    Scenario: Test scenario for web driver
    Given client open web page

    Scenario: Portnov responsive test
        Given client open portnov web page
        Then client set browser size to mobile

    Scenario: Iterate through elements
      Given client open test url for the form
        And I type "111" into all input fields
      Then I wait for 2 sec

    Scenario: Location strategy examples
      Given I open url "http://quote-stage.portnov.com/"
      Then I search for the element
@smoke
    Scenario: Quote stage smoke test
      Given I visit Quote Page in the "QA" Environment
      When I enter "username" for the Username field
      And I enter "first" for first name and "last" for the last name in the Name field
      And I enter "email" for the Email field
      When I enter "password" for the Password field
      And I enter "password" for the Confirm Password field
      Then I "check" the Privacy Policy Policy checkbox
      When I click on the "Submit" button at the bottom of the page
      Then I verify we see the Submitted Application Page


      Scenario Outline: Quote tests with datasets
        Given I open url "http://quote-stage.portnov.com/"
        Then I enter "<fullname>" into the field with xpath "//input[@id='name']"
        And I enter "<username>" into the field with xpath "//input[@name='username']"
        And I enter "<email>" into the field with xpath "//input[@name='email']"
        And I enter "<password>" into the field with xpath "//input[@name='password']"
        And I enter "<password>" into the field with xpath "//input[@name='confirmPassword']"
        And I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
        And I click on element with xpath "//button[@name='formSubmit']"

        Examples:
          |fullname | username              | email             | password   |
          |Kyrylo     | kirilltsirulnitsky  | test@gmail.com    | 345678     |
          |Kirill 1st | testing56           | test23@example.com| 458766&^%  |
          |Kiruha     | tester45            | test11@example    | swordfish  |