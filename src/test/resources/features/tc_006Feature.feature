Feature: Validar carga y descompresión de archivos comprimidos

  Scenario: Subir y descomprimir un archivo comprimido
    Given el usuario está en la página de carga de archivos
    When el usuario sube un archivo comprimido
    Then el sistema detecta el archivo comprimido
    And el sistema descomprime el archivo automáticamente
    And el usuario puede ver los documentos contenidos en el archivo