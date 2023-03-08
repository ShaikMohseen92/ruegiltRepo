Feature: Registering in Rue website

  Scenario: Register in rue website
    Given Launch the ruelala application
    When I enter email id and click continue
    And I enter password and click on login
    Then I validate homepage