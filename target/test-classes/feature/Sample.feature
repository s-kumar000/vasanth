@tag
Feature: DemoQA

  @tag1
  Scenario: Title of your scenario
    Given The user will open the demoQa website
    When The user will fill the user registeration form
      | vasanth | kumar | India | 01 | 01 | 2001 | 12345689 | kumar00 | kumar@gmail.com |
    Then The user wil verify the given data

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user will open the demoQa website
    When The user click the hobby and status"<status>"
    Then The user will verify the selection"<status>"

    Examples: 
      | status   |
      | Single   |
      | Married  |
      | Divorced |
      | Dance    |
      | Reading  |
      | Cricket  |
