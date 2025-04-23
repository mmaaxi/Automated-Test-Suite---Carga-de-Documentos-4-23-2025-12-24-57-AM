Feature: Validar visualización de vista previa de archivos cargados

  Scenario: Visualización correcta en la vista previa de archivos cargados
    Given el usuario está en la página de carga de archivos
    When el usuario carga uno o varios archivos
    Then cada archivo se muestra en la vista previa con su nombre, tamaño y formato
    And los detalles corresponden al archivo seleccionado