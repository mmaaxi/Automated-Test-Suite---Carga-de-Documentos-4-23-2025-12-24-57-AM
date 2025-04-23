package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    // Locators
    By openPathButton = By.id("openPathButton");
    By documentPreview = By.id("documentPreview");
    By documentList = By.id("documentList");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("https://example.com/document-upload");
    }

    public void clickOpenPathButton() {
        driver.findElement(openPathButton).click();
    }

    public void verifyFileExplorerOpened() {
        // Logic to verify file explorer opened
    }

    public void selectValidDocument() {
        // Logic to select a valid document
        // Simulate document selection using robot or auto it
    }

    public void verifyDocumentPreview() {
        // Logic to verify document is displayed in the preview
    }

    public void confirmFileSelection() {
        // Logic to confirm the file selection
    }

    public void verifyDocumentLoadedInList() {
        // Logic to verify the document appears in the list
    }
}