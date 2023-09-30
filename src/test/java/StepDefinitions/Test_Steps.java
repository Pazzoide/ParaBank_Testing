package StepDefinitions;

import Pages.WebElementManager;
import Utilities.G_W_D;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test_Steps {
    WebElementManager wem = new WebElementManager();

    @Given("Navigate to ParaBank website")
    public void navigateToParaBank() {
        G_W_D.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("The user clicks the element")
    public void theUserClicksTheElement(DataTable tableData) {
        List<String> elementLinks = tableData.asList(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement clickedElements = wem.getWebElement(elementLinks.get(i));
            wem.elementToClick(clickedElements);
        }
    }

    @Then("The user enters the required data")
    public void theUserEntersTheRequiredData(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement sendKeysElements = wem.getWebElement(elementLinks.get(i).get(0));
            wem.inputElement(sendKeysElements, elementLinks.get(i).get(1));
        }
    }

    @Then("The user verifies the message")
    public void theUserVerifiesTheMessage(DataTable tableData) {
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement verifyElements = wem.getWebElement(elementLinks.get(i).get(0));
            wem.textVerificationResult(verifyElements, elementLinks.get(i).get(0));
        }
    }
    @And("The user selects the element")
    public void theUserSelectsTheElement(DataTable tableData){
        List<List<String>> elementLinks = tableData.asLists(String.class);
        for (int i = 0; i < elementLinks.size(); i++) {
            WebElement selectElement = wem.getWebElement(elementLinks.get(i).get(0));
            wem.dropdownHandler(selectElement,elementLinks.get(i).get(0));
        }
    }
}
