Feature: Validar funcionalidad del botón 'Abrir ruta' para carga de documentos

  Scenario: Cargar un documento válido
    Given El usuario está en la página de carga de documentos
    When Hace clic en el botón 'Abrir ruta'
    Then Se debe abrir el explorador de archivos

    When El usuario selecciona un documento válido
    Then El sistema debe mostrar el documento seleccionado en la vista previa

    When El usuario confirma la selección del archivo
    Then El archivo debe cargarse y mostrarse en la lista de documentos para la solicitud