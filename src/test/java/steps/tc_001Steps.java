package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page = new tc_001Page(driver);
        page.navigateToPage();
    }

    @When("Hace clic en el botón 'Abrir ruta'")
    public void hace_clic_en_el_botón_abrir_ruta() {
        page.clickOpenPathButton();
    }

    @Then("Se debe abrir el explorador de archivos")
    public void se_debe_abrir_el_explorador_de_archivos() {
        page.verifyFileExplorerOpened();
    }

    @When("El usuario selecciona un documento válido")
    public void el_usuario_selecciona_un_documento_válido() {
        page.selectValidDocument();
    }

    @Then("El sistema debe mostrar el documento seleccionado en la vista previa")
    public void el_sistema_debe_mostrar_el_documento_seleccionado_en_la_vista_previa() {
        page.verifyDocumentPreview();
    }

    @When("El usuario confirma la selección del archivo")
    public void el_usuario_confirma_la_seleccion_del_archivo() {
        page.confirmFileSelection();
    }

    @Then("El archivo debe cargarse y mostrarse en la lista de documentos para la solicitud")
    public void el_archivo_debe_cargarse_y_mostrarse_en_la_lista_de_documentos_para_la_solicitud() {
        page.verifyDocumentLoadedInList();
    }
}