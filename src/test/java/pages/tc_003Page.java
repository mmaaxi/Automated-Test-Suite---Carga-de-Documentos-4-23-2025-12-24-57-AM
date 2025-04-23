package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class tc_003Page {
    WebDriver driver;

    @FindBy(id = "fileUpload")
    WebElement fileUploadInput;

    @FindBy(css = ".file-preview")
    List<WebElement> filePreviews;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFiles() {
        fileUploadInput.sendKeys("/path/to/file1.jpg\n/path/to/file2.docx");
    }

    public boolean isPreviewDisplayedCorrectly() {
        for (WebElement preview : filePreviews) {
            if (!preview.isDisplayed() ||
                preview.findElement(By.cssSelector(".file-name")).getText().isEmpty() ||
                preview.findElement(By.cssSelector(".file-size")).getText().isEmpty() ||
                preview.findElement(By.cssSelector(".file-format")).getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean doDetailsMatchSelectedFile() {
        // Implement logic to verify that the details displayed match the actual file details.
        // Placeholder for actual implementation.
        return true;
    }
}