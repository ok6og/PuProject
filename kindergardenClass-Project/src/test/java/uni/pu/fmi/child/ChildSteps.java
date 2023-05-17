package uni.pu.fmi.child;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uni.pu.fmi.models.Parent;

public class ChildSteps {
    private ChildPageModel childPageModel;

    @Given("Отваряме екрана за регистрация на дете")
    public void openChildPage() {this.childPageModel = new ChildPageModel(); }
    @When("Въвеждаме дали детето има увреждане: {string}")
    public void enterKidImpairment(String isImpaired){
        this.childPageModel.setIsImapaired(stringToBoolean(isImpaired));
    }
    @When("Въвеждаме дали детето има брат или сестра: {string}")
    public void enterKidHasSibling(String hasSibling){
        this.childPageModel.setHasSibling(stringToBoolean(hasSibling));
    }
    @When("Въвеждаме дали детето има близнак: {string}")
    public void enterKidIsTwin(String isTwin){
        this.childPageModel.setIsTwin(stringToBoolean(isTwin));
    }
    @When("Въвеждаме родителя на детето: {string}")
    public void enterKidParent(String parentName){
        var parent = new Parent();
        this.childPageModel.setParent(parent);
    }
    @When("Натискаме бутона за регистрация на детето в системата")
    public void clickRegistrationButton(){
        this.childPageModel.clickButton();
    }
    @Then("Получаваме съобщение: {string}")
    public void gettingMessage(String message){
        Assert.assertEquals(message,this.childPageModel.getMessage());
    }

    public Boolean stringToBoolean(String value) {
        if (value == null || "null".equals(value)) {
            return null;
        }
        return Boolean.valueOf(value);
    }

}
