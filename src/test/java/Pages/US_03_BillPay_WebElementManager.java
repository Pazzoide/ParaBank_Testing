package Pages;

import Utilities.G_W_D;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_03_BillPay_WebElementManager extends Parent {
    public US_03_BillPay_WebElementManager() {
        PageFactory.initElements(G_W_D.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement usernameBox;
    @FindBy(name = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginBtn;
    @FindBy(linkText = "Bill Pay")
    public WebElement billPayBtn;
    @FindBy (name = "payee.name")
    public WebElement payeeName;
    @FindBy (name = "payee.address.street")
    public WebElement adress ;
    @FindBy (name = "payee.address.city")
    public WebElement city ;
    @FindBy (name = "payee.address.state")
    public WebElement state;
    @FindBy (name = "payee.address.zipCode")
    public WebElement zipCode;
    @FindBy (name = "payee.phoneNumber")
    public WebElement phone;
    @FindBy (name = "payee.accountNumber")
    public WebElement account;
    @FindBy (name = "verifyAccount")
    public WebElement verifyAccount;
    @FindBy (name = "amount")
    public WebElement amount;
    @FindBy (xpath = "//input[@class='button']")
    public WebElement sendPayment;
    @FindBy(xpath = "//div[@ng-show='showResult']")
    public WebElement successMsg;
    @FindBy (linkText = "Accounts Overview")
    public WebElement accountsOverview;
    @FindBy (xpath = "//tr[@class='ng-scope']//a")
    public WebElement accountsNumber;
    @FindBy (id = "transactionTable")
    public WebElement successPayment;


    public WebElement getWebElement(String targetElement) {
        switch (targetElement) {
            case "usernameBox" : return this.usernameBox;
            case "passwordBox" : return this.passwordBox;
            case "loginBtn" : return this.loginBtn;
            case "billPayBtn" : return this.billPayBtn;
            case "payeeName" : return this.payeeName;
            case "adress" : return this.adress;
            case "city" : return this.city;
            case "state" : return this.state;
            case "zipCode" : return this.zipCode;
            case "phone" : return this.phone;
            case "account" : return this.account;
            case "verifyAccount" : return this.verifyAccount;
            case "amount" : return this.amount;
            case "sendPayment" : return this.sendPayment;
            case "successMsg" : return this.successMsg;
            case "accountsOverview" : return this.accountsOverview;
            case "accountsNumber" : return this.accountsNumber;
            case "successPayment" : return this.successPayment;
        }
        return null;
    }


}
