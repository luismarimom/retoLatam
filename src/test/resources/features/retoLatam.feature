Feature: reto de automatización web latam para ingreso a Banistmo

  Scenario:validar longitud de codigo
    Given que el usuario ingresa a la web de Latam
    When busca el codigo de reserva de ejemplo
    Then valida que la longitud es 6