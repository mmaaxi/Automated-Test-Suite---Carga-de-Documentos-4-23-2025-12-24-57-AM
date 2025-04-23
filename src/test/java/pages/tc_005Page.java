package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;
    By proceedButton = By.id("proceedButton");
    By errorMessageContainer = By.id("errorMessageContainer");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void attemptToProceedWithoutDocument() {
        WebElement button = driver.findElement(proceedButton);
        button.click();
    }

    public boolean isDocumentMissingErrorDisplayed() {
        return driver.findElement(errorMessageContainer).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageContainer).getText();
    }
}