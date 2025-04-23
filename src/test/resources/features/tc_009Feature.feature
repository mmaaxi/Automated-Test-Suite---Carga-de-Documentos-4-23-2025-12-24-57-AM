Feature: Validate integration with quotation flow and output slip generation

  Scenario: Validate integration with document upload and slip generation
    Given the user has completed the document upload and processing
    When the system extracts and integrates information with the quotation system
    Then the output slip is generated with correct data
    And the user sees the output slip