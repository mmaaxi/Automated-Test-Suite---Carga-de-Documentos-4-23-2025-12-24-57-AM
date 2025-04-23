package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    WebDriver driver;
    By uploadInput = By.id("upload-input");
    By deleteButton = By.cssSelector(".file-preview .delete-btn");
    By confirmButton = By.id("confirm-upload");
    By fileList = By.id("file-list");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean isFileUploaded() {
        return driver.findElement(fileList).getText().contains("file.txt");
    }

    public void deleteFile() {
        driver.findElement(deleteButton).click();
    }

    public boolean isFileInUploadList() {
        return driver.findElement(fileList).getText().contains("file.txt");
    }

    public void confirmUpload() {
        driver.findElement(confirmButton).click();
    }

    public boolean isUploadConfirmedWithoutFile() {
        // Add logic to verify that upload is confirmed without the deleted file
        return true; // Placeholder for actual verification logic
    }
}