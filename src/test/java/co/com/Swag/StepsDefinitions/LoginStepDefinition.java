package co.com.Swag.StepsDefinitions;

import com.co.swag.Models.LoginData;
import com.co.swag.Steps.LoginStep;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {
    @Steps
    LoginStep loginStep;

    @Given("^the user open the page$")
    public void theUserOpenThePage() {
        loginStep.OpenPage();
    }
    @When("^the user enter the credentials$")
    public void theUserEnterTheCredentials(List<LoginData>loginDataList) {
        LoginData loginData;
        loginData=loginDataList.get(0);
        loginStep.enterUser(loginData.getUser());
        loginStep.enterPass(loginData.getPass());
        loginStep.enterLogin();
    }

    @Then("^the user will be login$")
    public void theUserWillBeLogin() {

    }
}
