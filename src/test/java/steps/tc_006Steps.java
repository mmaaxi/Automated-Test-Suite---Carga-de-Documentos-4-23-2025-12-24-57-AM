package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_está_en_la_página_de_carga_de_archivos() {
        page.navegarAPaginaDeCarga();
    }

    @When("el usuario sube un archivo comprimido")
    public void el_usuario_sube_un_archivo_comprimido() {
        page.subirArchivoComprimido("/path/to/compressed/file.zip");
    }

    @Then("el sistema detecta el archivo comprimido")
    public void el_sistema_detecta_el_archivo_comprimido() {
        Assert.assertTrue(page.esArchivoComprimidoDetectado());
    }

    @Then("el sistema descomprime el archivo automáticamente")
    public void el_sistema_descomprime_el_archivo_automáticamente() {
        Assert.assertTrue(page.esArchivoDescomprimidoAutomáticamente());
    }

    @Then("el usuario puede ver los documentos contenidos en el archivo")
    public void el_usuario_puede_ver_los_documentos_contenidos_en_el_archivo() {
        Assert.assertTrue(page.sonDocumentosVisibles());
    }
}