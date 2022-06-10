package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lippia.web.services.AutoPracLoginPageService;

public class AutomationPracticeSteps {
    @Given("El usuario conecta a la pagina web")
    public void home() {
        AutoPracLoginPageService.navegarWeb();
    }

    @And("El usuario hace click en My Accounts")
    public void elUsuarioHaceClickEnMyAccounts() {
        AutoPracLoginPageService.clickOnMyAccount();

    }

    @And("^El usuario ingresa username '(.*)'$")
    public void inputUsername(String username) {
        AutoPracLoginPageService.inputUsername(username);
    }

    @And("^El usuario ingresa password '(.*)'$")
    public void inputPassword(String password) {
        AutoPracLoginPageService.inputPassword(password);
    }

    @And("El usuario hace click buton Login")
    public void elUsuarioHaceClickButonLogin() {
        AutoPracLoginPageService.clickOnBtnLogin();
    }

    @Then("^El usuario verifica login correctamente'(.*)'$")
    public void elUsuarioVerificaLoginCorrectamente(String mensaje) {
        AutoPracLoginPageService.verificaLogin(mensaje);
    }

    @Then("^El usuario visualiza mensaje de error'(.*)'$")
    public void elUsuarioVisualizaMensajeDeError(String mensaje) {
        AutoPracLoginPageService.errorMessage(mensaje);
    }
}
