package pages;

import org.openqa.selenium.WebDriver;

public class tc_010Page {

    private WebDriver driver;
    private String url = "http://example.com/document-upload";

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get(url);
    }

    public boolean isInterfaceIntuitiveAndClear() {
        // Implementar lógica para verificar que la interfaz sea intuitiva y clara
        return true;  // Simulación de resultado positivo
    }

    public boolean isFeedbackPositive() {
        // Implementar lógica para verificar el feedback de usabilidad
        return true;  // Simulación de resultado positivo
    }
}