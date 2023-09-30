package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementManager extends Parent {
    public WebElementManager() {
        PageFactory.initElements(G_W_D.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement register;
    @FindBy(css = "input[id='customer.firstName']")
    public WebElement firsName;
    @FindBy(css = "input[id='customer.lastName']")
    public WebElement lastName;
    @FindBy(css = "input[id='customer.address.street']")
    public WebElement address;
    @FindBy(css = "input[id='customer.address.city']")
    public WebElement city;
    @FindBy(css = "input[id='customer.address.state']")
    public WebElement state;
    @FindBy(css = "input[id='customer.address.zipCode']")
    public WebElement zip;
    @FindBy(css = "input[id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(css = "input[id='customer.ssn']")
    public WebElement ssn;
    @FindBy(css = "input[id='customer.username']")
    public WebElement username;
    @FindBy(css = "input[id='customer.password']")
    public WebElement password;
    @FindBy(css = "input[id='repeatedPassword']")
    public WebElement confirmPassword;
    @FindBy(css = "input[value='Register']")
    public WebElement registerBtn;
    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement successMsg;
    @FindBy(css = "input[name='username']")
    public WebElement usernameBox;
    @FindBy(css = "input[name='password']")
    public WebElement passwordBox;
    @FindBy(css = "input[class='button']")
    public WebElement loginBtn;
    @FindBy(xpath = "//p[text()='The username and password could not be verified.']")
    public WebElement failedMsg;
    @FindBy(linkText = "Bill Pay")
    public WebElement billPay;
    @FindBy(css = "input[name='payee.name']")
    public WebElement payeeName;
    @FindBy(css = "input[name='payee.address.street']")
    public WebElement owingAddress;
    @FindBy(css = "input[name='payee.address.city']")
    public WebElement owingCity;
    @FindBy(css = "input[name='payee.address.state']")
    public WebElement owingState;
    @FindBy(css = "input[name='payee.address.zipCode']")
    public WebElement owingZip;
    @FindBy(css = "input[name='payee.phoneNumber']")
    public WebElement owingPhone;
    @FindBy(css = "input[name='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(css = "input[name='verifyAccount']")
    public WebElement payeeAccountVerify;
    @FindBy(css = "input[name='amount']")
    public WebElement amount;
    @FindBy(css = "select[name='fromAccountId']")
    public WebElement fromAccount;
    @FindBy(css = "input[value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement paymentMsg;
    @FindBy(linkText = "Accounts Overview")
    public WebElement accountsOverview;
    @FindBy(linkText = "123678")
    public WebElement accountNumber;
    @FindBy(linkText = "Bill Payment to Electricity")
    public WebElement electricity;
    @FindBy(linkText = "Bill Payment to Water")
    public WebElement water;
    @FindBy(linkText = "Bill Payment to Natural Gas")
    public WebElement naturalGas;
    @FindBy(xpath = "//h1[text()='Transaction Details']")
    public WebElement transactionDetails;



    public WebElement getWebElement(String targetElement) {
        switch (targetElement) {
            case "register": return this.register;
            case "firsName": return this.firsName;
            case "lastName": return this.lastName;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zip": return this.zip;
            case "phone": return this.phone;
            case "ssn": return this.ssn;
            case "username": return this.username;
            case "password": return this.password;
            case "confirmPassword": return this.confirmPassword;
            case "registerBtn": return this.registerBtn;
            case "successMsg": return this.successMsg;
            case "usernameBox": return this.usernameBox;
            case "passwordBox": return this.passwordBox;
            case "loginBtn": return this.loginBtn;
            case "failedMsg": return this.failedMsg;
            case "billPay": return this.billPay;
            case "payeeName": return this.payeeName;
            case "owingAddress": return this.owingAddress;
            case "owingCity": return this.owingCity;
            case "owingState": return this.owingState;
            case "owingZip": return this.owingZip;
            case "owingPhone": return this.owingPhone;
            case "payeeAccount": return this.payeeAccount;
            case "payeeAccountVerify": return this.payeeAccountVerify;
            case "amount": return this.amount;
            case "fromAccount": return this.fromAccount;
            case "sendPayment": return this.sendPayment;
            case "paymentMsg": return this.paymentMsg;
            case "accountsOverview": return this.accountsOverview;
            case "accountNumber": return this.accountNumber;
            case "electricity": return this.electricity;
            case "water": return this.water;
            case "naturalGas": return this.naturalGas;
            case "transactionDetails": return this.transactionDetails;
        }
        return null;
    }
}
