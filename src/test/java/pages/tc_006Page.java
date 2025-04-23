package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    private WebDriver driver;
    private By uploadButton = By.id("uploadButton");
    private By fileUploadInput = By.id("fileUploadInput");
    private By compressedFileIcon = By.id("compressedFileIcon");
    private By decompressedDocumentsContainer = By.id("decompressedDocumentsContainer");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCarga() {
        driver.get("https://example.com/upload");
    }

    public void subirArchivoComprimido(String filePath) {
        WebElement uploadInputElement = driver.findElement(fileUploadInput);
        uploadInputElement.sendKeys(filePath);
    }

    public boolean esArchivoComprimidoDetectado() {
        return driver.findElement(compressedFileIcon).isDisplayed();
    }

    public boolean esArchivoDescomprimidoAutomáticamente() {
        // Logic to ensure file is decompressed
        return driver.findElement(decompressedDocumentsContainer).isDisplayed();
    }

    public boolean sonDocumentosVisibles() {
        // Logic to verify the documents inside the decompressed container
        return driver.findElement(decompressedDocumentsContainer).isDisplayed();
    }
}