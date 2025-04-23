package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("^I have a file of size between 5 MB and 500 MB$")
    public void i_have_a_file_of_size_between_5_and_500_MB() {
        page.prepareLargeFile();
    }

    @When("^I upload the file$")
    public void i_upload_the_file() {
        page.uploadFile();
    }

    @Then("^the upload and processing should complete in less than 10 seconds$")
    public void the_upload_and_processing_should_complete_in_less_than_10_seconds() {
        long duration = page.getProcessingTime();
        Assert.assertTrue("Process took longer than expected", duration < 10000);
    }

    @Given("^I have a file of size up to 5 MB$")
    public void i_have_a_file_of_size_up_to_5_MB() {
        page.prepareSmallFile();
    }

    @Then("^the upload should complete in less than 1 second$")
    public void the_upload_should_complete_in_less_than_1_second() {
        long duration = page.getUploadingTime();
        Assert.assertTrue("Upload took longer than expected", duration < 1000);
    }

    @Given("^I have a file ready for upload$")
    public void i_have_a_file_ready_for_upload() {
        page.prepareAnyFile();
    }

    @When("^I start the upload and processing$")
    public void i_start_the_upload_and_processing() {
        page.uploadAndProcessFile();
    }

    @Then("^the entire process should execute in less than 30 seconds$")
    public void the_entire_process_should_execute_in_less_than_30_seconds() {
        long duration = page.getTotalProcessTime();
        Assert.assertTrue("Total process took longer than expected", duration < 30000);
    }
}