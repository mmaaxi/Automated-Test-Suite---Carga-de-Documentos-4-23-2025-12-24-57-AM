Feature: Validate the response times of the loading and processing process

  Scenario: Load and process file between 5 MB and 500 MB
    Given I have a file of size between 5 MB and 500 MB
    When I upload the file
    Then the upload and processing should complete in less than 10 seconds

  Scenario: Upload file of smaller size (up to 5 MB)
    Given I have a file of size up to 5 MB
    When I upload the file
    Then the upload should complete in less than 1 second

  Scenario: Measure total time from file selection to output slip generation
    Given I have a file ready for upload
    When I start the upload and processing
    Then the entire process should execute in less than 30 seconds