package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("the user has completed the document upload and processing")
    public void completeDocumentUploadAndProcessing() {
        page.completeDocumentUploadAndProcessing();
    }

    @When("the system extracts and integrates information with the quotation system")
    public void extractAndIntegrateWithQuotationSystem() {
        boolean isIntegrated = page.extractAndIntegrateWithQuotationSystem();
        Assert.assertTrue("Integration with quotation system failed.", isIntegrated);
    }

    @Then("the output slip is generated with correct data")
    public void verifyOutputSlipGeneration() {
        boolean isSlipGeneratedCorrectly = page.verifyOutputSlipGeneration();
        Assert.assertTrue("Output slip was not generated with correct data.", isSlipGeneratedCorrectly);
    }

    @Then("the user sees the output slip")
    public void verifyOutputSlipDisplayed() {
        boolean isSlipVisible = page.verifyOutputSlipDisplayed();
        Assert.assertTrue("Output slip is not visible to the user.", isSlipVisible);
    }
}