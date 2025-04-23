Feature: Validar mensaje de error para ausencia de documento obligatorio

  Scenario: Intentar avanzar sin documento obligatorio
    Given el usuario está en el proceso de carga
    When el usuario intenta avanzar sin adjuntar el documento obligatorio
    Then el sistema debe detectar la ausencia del documento obligatorio
    And se muestra un mensaje de error indicando que falta un documento obligatorio