package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage = new tc_002Page(driver);
    
    @Given("that a user is on the document upload page")
    public void user_on_upload_page() {
        uploadPage.navigateToUploadPage();
    }
    
    @When("the user drags a valid file to the upload area")
    public void user_drags_file_to_upload_area() {
        uploadPage.dragAndDropFile();
    }
    
    @Then("the file should be detected and added to the upload list")
    public void file_detected_and_added_to_list() {
        Assert.assertTrue(uploadPage.isFilePresentInUploadList());
    }
    
    @When("the user verifies the file preview")
    public void user_verifies_file_preview() {
        uploadPage.previewFileDetails();
    }
    
    @Then("the preview should display the correct name, size, and type of the file")
    public void preview_displays_correct_details() {
        Assert.assertTrue(uploadPage.isFilePreviewCorrect());
    }
    
    @When("the user confirms the file upload")
    public void user_confirms_file_upload() {
        uploadPage.confirmFileUpload();
    }
    
    @Then("the file should be processed and integrated into the system for quoting")
    public void file_processed_and_integrated() {
        Assert.assertTrue(uploadPage.isFileProcessedAndIntegrated());
    }
}