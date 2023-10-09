package StepDefinitions;


import Pages.US_03_BillPay_WebElementManager;
import Utilities.G_W_D;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_03_BillPay_Test_Steps {

    US_03_BillPay_WebElementManager us3 = new US_03_BillPay_WebElementManager();

    @Given("Navigate to ParaBankParasoft website")
    public void navigateToParaBankParasoftWebsite() {
        G_W_D.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("User enters information")
    public void userEntersInformation(DataTable dt) {
        List<List<String>>   items=  dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e=us3.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            us3.inputElement(e, yazi);
        }
    }

    @Then("User clicks the element")
    public void userClicksTheElement(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);
        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = us3.getWebElement(strButtonsList.get(i));
            us3.elementToClick(linkWebElement);
        }

    }

    @And("User verifies electric payment message")
    public void userVerifiesElectricPaymentMessage() {
        us3.textVerificationResult(us3.successMsg, "$40.00");
    }

    @And("User verifies electricity payment")
    public void userVerifiesElectricityPayment() {
        us3.textVerificationResult(us3.successPayment, "10-09-2023 Bill Payment to Enerjisa Elektrik $40.00");
    }

    @And("User verifies water payment message")
    public void userVerifiesWaterPaymentMessage() {
        us3.textVerificationResult(us3.successMsg, "$20.00");
    }

    @And("User verifies water payment")
    public void userVerifiesWaterPayment() {
        us3.textVerificationResult(us3.successPayment, "10-09-2023 Bill Payment to iski A.S $20.00");
    }

    @And("User verifies natural gas payment message")
    public void userVerifiesNaturalGasPaymentMessage() {
        us3.textVerificationResult(us3.successMsg, "$50.00");
    }

    @And("User verifies natural gas payment")
    public void userVerifiesNaturalGasPayment() {
        us3.textVerificationResult(us3.successPayment, "10-09-2023 Bill Payment to IGDAS A.S $50.00");
    }
}
