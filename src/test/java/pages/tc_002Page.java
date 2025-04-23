package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class tc_002Page {
    WebDriver driver;

    By uploadArea = By.id("upload-area");
    By fileNamePreview = By.id("file-name-preview");
    By fileSizePreview = By.id("file-size-preview");
    By fileTypePreview = By.id("file-type-preview");
    By confirmButton = By.id("confirm-upload");
    By uploadSuccessMessage = By.id("upload-success-message");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void dragAndDropFile() {
        WebElement source = driver.findElement(By.id("file-source"));
        WebElement target = driver.findElement(uploadArea);
        new Actions(driver).clickAndHold(source).moveToElement(target).release().build().perform();
    }

    public boolean isFilePresentInUploadList() {
        // logic to verify file is present in upload list
        return driver.findElements(By.xpath("//ul[@id='uploaded-files']//li")).size() > 0;
    }

    public void previewFileDetails() {
        // logic to show file preview details
    }

    public boolean isFilePreviewCorrect() {
        // logic to verify file preview details like name, size, and type
        String fileName = driver.findElement(fileNamePreview).getText();
        String fileSize = driver.findElement(fileSizePreview).getText();
        String fileType = driver.findElement(fileTypePreview).getText();

        return fileName.equals("expectedFileName") && fileSize.equals("expectedFileSize") && fileType.equals("expectedFileType");
    }
    
    public void confirmFileUpload() {
        driver.findElement(confirmButton).click();
    }

    public boolean isFileProcessedAndIntegrated() {
        return driver.findElement(uploadSuccessMessage).isDisplayed();
    }
}