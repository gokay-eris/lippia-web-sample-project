@Login
Feature: Login Page
  
  Scenario: El usuario ingresa con credencial valida
  Given El usuario conecta a la pagina web
  When El usuario hace click en My Accounts
  And El usuario ingresa username 'Geris@test.com'
  And El usuario ingresa password 'GkyTesting_2022'
  And El usuario hace click buton Login
  Then El usuario verifica login correctamente'Hello Geris (not Geris? Sign out)'

  Scenario Outline: El usuario ingresa con credencial invalida
    Given El usuario conecta a la pagina web
    When El usuario hace click en My Accounts
    And El usuario ingresa username '<username>'
    And El usuario ingresa password '<password>'
    And El usuario hace click buton Login
    Then El usuario visualiza mensaje de error'<mensaje>'

    Examples:
      | username       | password        | mensaje                                                                                           |
      | geris@test.com | gkyTesting_2022 | ERROR: The password you entered for the username geris@test.com is incorrect. Lost your password? |
      | Geris@test.com | gkyTesting_2022 | ERROR: The password you entered for the username Geris@test.com is incorrect. Lost your password? |
      | Geris@test.com |                 | Error: Password is required.                                                                      |
      |                | GkyTesting_2022 | Error: Username is required.                                                                      |
      |                |                 | Error: Username is required.                                                                      |

