Feature: Validate option to delete files before confirming upload

  Scenario: Delete file before confirming upload
    Given I have uploaded a file
    When I select the 'Delete' option in the preview
    Then the file should be removed from the upload list
    When I attempt to confirm the upload
    Then the system should proceed without including the deleted file