Feature: Validate OCR functionality and extraction using METIQ

  Scenario: Successful OCR processing and information extraction
    Given I have documents with legible content for OCR
    When I upload the documents
    Then the system should process the OCR and extract the relevant information using METIQ
    When I review the extracted information in the preview
    Then the extracted information should correspond to the original content of the document
    When I edit the extracted information if necessary and confirm
    Then the changes should be correctly recorded in the request