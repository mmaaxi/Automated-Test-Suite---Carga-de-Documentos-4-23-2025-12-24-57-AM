package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page;

    @Given("^I have uploaded a file$")
    public void uploadFile() {
        page = PageFactory.initElements(driver, tc_004Page.class);
        page.uploadFile("path/to/file");
        Assert.assertTrue(page.isFileUploaded());
    }

    @When("^I select the 'Delete' option in the preview$")
    public void deleteFileFromPreview() {
        page.deleteFile();
    }

    @Then("^the file should be removed from the upload list$")
    public void fileShouldBeRemovedFromList() {
        Assert.assertFalse(page.isFileInUploadList());
    }

    @When("^I attempt to confirm the upload$")
    public void attemptToConfirmUpload() {
        page.confirmUpload();
    }

    @Then("^the system should proceed without including the deleted file$")
    public void systemProceedsWithoutDeletedFile() {
        Assert.assertTrue(page.isUploadConfirmedWithoutFile());
    }
}