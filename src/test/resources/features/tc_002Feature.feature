Feature: Validate 'Drag and Drop' functionality for document upload

  Scenario: Successful document upload through drag and drop
    Given that a user is on the document upload page
    When the user drags a valid file to the upload area
    Then the file should be detected and added to the upload list
    When the user verifies the file preview
    Then the preview should display the correct name, size, and type of the file
    When the user confirms the file upload
    Then the file should be processed and integrated into the system for quoting