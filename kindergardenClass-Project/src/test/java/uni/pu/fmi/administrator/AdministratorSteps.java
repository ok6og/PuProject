package uni.pu.fmi.administrator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdministratorSteps {
    private AdministratorPageModel administratorPageModel;

    @Given("Отваряме екрана за класиране на дете")
    public void openAdministratorPage(){this.administratorPageModel = new AdministratorPageModel();}
    @When("Попълваме информация за детето има брат или сестра: {string}")
    public void hasSiblings(String hasSibling){
        this.administratorPageModel.setBoolsForPoints(Boolean.valueOf(hasSibling));
    }
    @When("Попълваме информация за детето има увреждане: {string}")
    public void enterKidImpairment(String isImpaired){
        this.administratorPageModel.setBoolsForPoints(Boolean.valueOf(isImpaired));
    }
    @When("Попълваме информация за детето има близнак: {string}")
    public void hasTwin(String isTwin){
        this.administratorPageModel.setBoolsForPoints(Boolean.valueOf(isTwin));
    }
    @When("Попълваме информация за родител на детето работи: {string}")
    public void isWorking(String IsWorking){
        this.administratorPageModel.setBoolsForPoints(Boolean.valueOf(IsWorking));
    }
    @When("Натискаме бутона за класиране на детето в системата")
    public void clickClassButton(){this.administratorPageModel.clickButton();}
    @Then("Получаваме съобщение: {string}")
    public void gettingMessage(String message){
        Assert.assertEquals(message,this.administratorPageModel.getMessage());
    }
}




