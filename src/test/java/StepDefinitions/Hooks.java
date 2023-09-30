package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.G_W_D;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before() {

    }

    @After
    public void after(Scenario senaryo) {
        ExcelUtility.writeToExcel("src/ExcelReports/ParaBank.xlsx", senaryo);
        if (senaryo.isFailed()) {
            TakesScreenshot screenshotTaker = ((TakesScreenshot) G_W_D.getDriver());
            byte[] inMemoryState = screenshotTaker.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(inMemoryState, "image/png", "screenshot name");
        }
        G_W_D.quitDriver();
    }
}
