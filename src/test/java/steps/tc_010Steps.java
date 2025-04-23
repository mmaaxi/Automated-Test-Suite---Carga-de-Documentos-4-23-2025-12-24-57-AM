package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;

import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    private WebDriver driver;
    private tc_010Page page;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_010Page.class);
    }

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("El usuario evalúa la interfaz")
    public void elUsuarioEvaluaLaInterfaz() {
        // Simulación de evaluación de interfaz
    }

    @Then("La interfaz debe ser intuitiva y clara")
    public void laInterfazDebeSerIntuitivaYClara() {
        assertTrue(page.isInterfaceIntuitiveAndClear());
    }

    @When("Se realizan pruebas de usabilidad")
    public void seRealizanPruebasDeUsabilidad() {
        // Simulación de pruebas de usabilidad
    }

    @Then("El feedback debe indicar que el proceso es sencillo y eficaz")
    public void elFeedbackDebeIndicarQueElProcesoEsSencilloYEficaz() {
        assertTrue(page.isFeedbackPositive());
    }
}