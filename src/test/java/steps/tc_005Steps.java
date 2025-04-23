package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario está en el proceso de carga")
    public void elUsuarioEstaEnElProcesoDeCarga() {
        page.openUploadPage();
    }

    @When("el usuario intenta avanzar sin adjuntar el documento obligatorio")
    public void elUsuarioIntentaAvanzarSinAdjuntarElDocumentoObligatorio() {
        page.attemptToProceedWithoutDocument();
    }

    @Then("el sistema debe detectar la ausencia del documento obligatorio")
    public void elSistemaDebeDetectarLaAusenciaDelDocumentoObligatorio() {
        Assert.assertTrue("El documento obligatorio debería faltar", page.isDocumentMissingErrorDisplayed());
    }

    @Then("se muestra un mensaje de error indicando que falta un documento obligatorio")
    public void seMuestraUnMensajeDeErrorIndicandoQueFaltaUnDocumentoObligatorio() {
        Assert.assertEquals("Error: falta un documento obligatorio", page.getErrorMessage());
    }
}