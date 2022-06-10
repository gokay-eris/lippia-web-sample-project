Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario: The client search by "crowdar"
    Given The client is in google page
    When The client search for word crowdar
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "A utomation"
    Given The client is in google page
    When The client search for word Automation
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Docker"
    Given The client is in google page
    When The client search for word Docker
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Lippia"
    Given The client is in google page
    When The client search for word Lippia
    Then The client verify that results are shown properly

  @Smoke
  Scenario: El usuario ingresa con credencial valida
    Given El usuario conecta a la pagina web
    When El usuario hace click en My Accounts
    And El usuario ingresa username 'Geris@test.com'
    And El usuario ingresa password 'GkyTesting_2022'
    And El usuario hace click buton Login
    Then El usuario verifica login correctamente