Feature: Validar experiencia de usuario e interfaz intuitiva

  Scenario: Evaluar la interfaz durante el proceso de carga de documentos
    Given El usuario está en la página de carga de documentos
    When El usuario evalúa la interfaz
    Then La interfaz debe ser intuitiva y clara

  Scenario: Realizar pruebas de usabilidad con un grupo de usuarios
    Given El usuario está en la página de carga de documentos
    When Se realizan pruebas de usabilidad
    Then El feedback debe indicar que el proceso es sencillo y eficaz