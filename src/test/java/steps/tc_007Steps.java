package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;

public class tc_007Steps {
    private WebDriver driver;
    private tc_007Page page;

    public tc_007Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_007Page(driver);
    }

    @Given("I have documents with legible content for OCR")
    public void i_have_documents_with_legible_content_for_ocr() {
        page.prepareDocumentsForOCR();
    }

    @When("I upload the documents")
    public void i_upload_the_documents() {
        page.uploadDocuments();
    }

    @Then("the system should process the OCR and extract the relevant information using METIQ")
    public void the_system_should_process_the_ocr_and_extract_the_relevant_information() {
        Assert.assertTrue(page.isOcrProcessedAndExtracted());
    }

    @When("I review the extracted information in the preview")
    public void i_review_the_extracted_information_in_the_preview() {
        page.openExtractedInformationPreview();
    }

    @Then("the extracted information should correspond to the original content of the document")
    public void the_extracted_information_should_correspond_to_the_original_content_of_the_document() {
        Assert.assertTrue(page.isExtractedInformationAccurate());
    }

    @When("I edit the extracted information if necessary and confirm")
    public void i_edit_the_extracted_information_if_necessary_and_confirm() {
        page.editAndConfirmExtractedInformation();
    }

    @Then("the changes should be correctly recorded in the request")
    public void the_changes_should_be_correctly_recorded_in_the_request() {
        Assert.assertTrue(page.areChangesRecordedCorrectly());
    }
}