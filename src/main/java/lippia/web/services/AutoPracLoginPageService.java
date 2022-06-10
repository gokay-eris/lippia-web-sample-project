package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.AutoPracLoginPageConstants;
import org.testng.Assert;

public class AutoPracLoginPageService {
    public static void navegarWeb(){
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickOnMyAccount(){

        WebActionManager.click(AutoPracLoginPageConstants.BTN_MY_ACCOUNT_ID);
    }
    public static void inputUsername(String username){
        WebActionManager.setInput(AutoPracLoginPageConstants.INPUT_USERNAME, username);
    }

    public static void inputPassword(String password){
        WebActionManager.setInput(AutoPracLoginPageConstants.INPUT_PASSWORD, password);
    }

    public static void clickOnBtnLogin(){

        WebActionManager.click(AutoPracLoginPageConstants.BTN_LOGIN);
    }
    public static void verificaLogin(String mensaje){
//        WebActionManager.waitVisibility(AutoPracLoginPageConstants.BTN_LOGOUT);
        String loginMsg = ActionManager.waitVisibility("xpath://*[@class= 'woocommerce-MyAccount-content']/p").getAttribute("textContent");
        System.out.println(loginMsg);
        Assert.assertTrue(loginMsg.contains(mensaje));
    }
    public static void errorMessage(String mensaje){
//        ActionManager.getElement(AutoPracLoginPageConstants.BTN_LOGOUT).isDisplayed();
//        WebActionManager.waitVisibility(AutoPracLoginPageConstants.BTN_LOGOUT).isDisplayed();

            String errorText = ActionManager.waitVisibility("xpath://*[@class='woocommerce-error']/li").getAttribute("textContent");
            System.out.println(errorText);
            Assert.assertEquals(errorText, mensaje);


    }
}
