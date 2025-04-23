package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("^el usuario está en la página de carga de archivos$")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        page.navigateToFileUploadPage();
    }

    @When("^el usuario carga uno o varios archivos$")
    public void elUsuarioCargaUnoOVariosArchivos() {
        page.uploadFiles();
    }

    @Then("^cada archivo se muestra en la vista previa con su nombre, tamaño y formato$")
    public void cadaArchivoSeMuestraEnLaVistaPreviaConSuNombreTamañoYFormato() {
        Assert.assertTrue("La vista previa no es correcta", page.isPreviewDisplayedCorrectly());
    }

    @Then("^los detalles corresponden al archivo seleccionado$")
    public void losDetallesCorrespondenAlArchivoSeleccionado() {
        Assert.assertTrue("Los detalles no corresponden al archivo", page.doDetailsMatchSelectedFile());
    }
}