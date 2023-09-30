package Pages;

import Utilities.G_W_D;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public WebDriverWait conditionWait = new WebDriverWait(G_W_D.getDriver(), Duration.ofSeconds(20));
    public JavascriptExecutor scriptRunner = (JavascriptExecutor) G_W_D.getDriver();

    public void elementToClick(WebElement targetElement) {
        conditionWait.until(ExpectedConditions.elementToBeClickable(targetElement));
        scrollFocusElement(targetElement);
        targetElement.click();
    }

    public void inputElement(WebElement targetElement, String text) {
        conditionWait.until(ExpectedConditions.visibilityOf(targetElement));
        scrollFocusElement(targetElement);
        targetElement.clear();
        targetElement.sendKeys(text);
    }

    public void scrollFocusElement(WebElement targetElement) {
        scriptRunner.executeScript("arguments[0].scrollIntoView();", targetElement);
    }

    public void textVerificationResult(WebElement targetElement, String value) {
        conditionWait.until(ExpectedConditions.textToBePresentInElement(targetElement, value));
        Assert.assertTrue(targetElement.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(G_W_D.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void clickByJavaScript(WebElement targetElement) {
        conditionWait.until(ExpectedConditions.elementToBeClickable(targetElement));
        scrollFocusElement(targetElement);
        scriptRunner.executeScript("arguments[0].click();", targetElement);
    }

    public void dropdownHandler(WebElement targetElement, String value) {
        conditionWait.until(ExpectedConditions.visibilityOf(targetElement));
        Select dropdownControl = new Select(targetElement);
        dropdownControl.deselectByValue(value);
    }

    public void hoverTarget(WebElement targetElement) {
        Actions actions = new Actions(G_W_D.getDriver());
        conditionWait.until(ExpectedConditions.visibilityOf(targetElement));
        Action action = actions.moveToElement(targetElement).build();
        action.perform();
    }
}
