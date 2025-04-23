package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    private WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void prepareDocumentsForOCR() {
        // Logic to ensure documents are ready for OCR
    }

    public void uploadDocuments() {
        // Code to upload the documents
        driver.findElement(By.id("uploadButton")).click();
    }

    public boolean isOcrProcessedAndExtracted() {
        // Logic to verify OCR and extraction by METIQ is successful
        return driver.findElement(By.id("ocrStatus")).getText().contains("Processed");
    }

    public void openExtractedInformationPreview() {
        // Navigate to preview the extracted information
        driver.findElement(By.id("previewLink")).click();
    }

    public boolean isExtractedInformationAccurate() {
        // Verify that the extracted information is accurate
        String extractedContent = driver.findElement(By.id("extractedContent")).getText();
        return extractedContent.contains("Expected Content");
    }

    public void editAndConfirmExtractedInformation() {
        // Edit the extracted information if required
        driver.findElement(By.id("editButton")).click();
        driver.findElement(By.id("confirmButton")).click();
    }

    public boolean areChangesRecordedCorrectly() {
        // Verify that changes are recorded correctly
        return driver.findElement(By.id("confirmationMessage")).getText().contains("Changes saved successfully");
    }
}