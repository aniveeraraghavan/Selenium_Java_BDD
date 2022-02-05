@patient
Feature: Patient
  In order to maintain patient records
  As a admin
  I would like to access OpenEMR portal

  Scenario: Add Patient
    Given I have a browser
    When I enter username as 'admin'
    And I enter password as "pass"
    And I select  language as 'English (Indian)'
    And I click on Login
    And I click on Patinet/Client
    And I click on Patient
    And I click on Add New Patient
    And I enter fill the form
      | firstname | lastname | dOB        | gender |
      | John      | Wick     | 1994-02-02 | Male   |
    And I click on create new patient
    And I click on confirm create new patient
    And  I store the text and handle the alert box
    And I click on happy birthday if available
    Then the alert text should contain 'Tobacco'
    And I shoudl get the added patient name 'John Wick'
