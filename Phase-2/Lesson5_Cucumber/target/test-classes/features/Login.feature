# This is my first feature file
Feature: Testing rediff myPage

  Scenario: User has to test if login on rediff is successful or not
    Given I open chrome browser
    When I enter rediff mypage URL
    Then I capture the title of the page
    Then I enter username as admin and password as admin@123
    When I click on login button
    Then I should see an error message
    And I click on click here link
    And I close the browser
