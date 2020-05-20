Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

    // Homework. Task 14.3. Additional scenarios

    Version 1

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $201
    Then $0 should be dispensed
    And I should be told I don't have enough funds to make this withdrawal

    // Version 2

  Scenario Outline: Unsuccessful withdrawal money from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request $30
    Then <money> should be dispensed
    Examples:
      | deposit | money |
      | 29 | 0 |
      | 20 | 0 |
      | 0 | 0 |