import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DialogBoxesPage;
import pages.HomePage;
import pages.objects.Button;

import java.io.File;
import java.io.IOException;

public class Test1 extends TestBase {

    private WebDriver driver;
    static ExtentReports report;

    @BeforeClass
    public static void startTest() throws IOException
    {
        String reportPath =
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "reports" + File.separator +
                        "TestReport.html";
        String configPath =
                "src" + File.separator +
                        "main" + File.separator +
                        "resources" + File.separator +
                        "configs" + File.separator +
                        "extentreports" + File.separator +
                        "spark-config.xml";
        report = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.loadXMLConfig(configPath);
        sparkReporter.config().setReportName("Sample Extent Report");
        report.setSystemInfo("Project", "TDL Summer School Final Task");
        report.setSystemInfo("Author", "Albina Evers");
        report.attachReporter(sparkReporter);
    }

    @Test(description = "Test1")
    public void firstTest() throws InterruptedException {
        //Initializing 'https://www.globalsqa.com/demo-site/'
        ExtentTest test = report.createTest("Create new user test - Test 1");
        test.log(Status.INFO, "Test 1 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.initialized()) {
            test.log(Status.INFO, "Home page is displayed");
        } else {
            test.log(Status.INFO, "Home page is NOT displayed");
        }

        //Scroll the scene till the button is in view
        //Click on button DialogBox
        homePage.dialogBoxButton.click();

        DialogBoxesPage dialogBoxesPage = new DialogBoxesPage(driver);

        /* Can't close the ad I gave up
        driver.switchTo().frame(driver.findElement(By.id("id=aswift_1")));
        driver.findElement(By.xpath(dialogBoxesPage.dismissButton.getLocator())).click() ;

        if(dialogBoxesPage.dismissButtonInitialized()) {
            test.log(Status.INFO, "Dialog Boxes page is NOT displayed");
            driver.findElement(By.xpath(dialogBoxesPage.dismissButton.getLocator())).click() ;
        }
        else {
            test.log(Status.INFO, "Dialog Boxes page is displayed");
            dialogBoxesPage.createNewUser.click();
        }

        //Click on button Create new user
        //dialogBoxesPage.createNewUser.click();*/
        closeDriver();

        //Log output in the console the text each field has

        //Remove all the text the form fields has

        //Add your own text for the fields

        //Log the output in the console the text each field has

        //Validate that a new entry is shown in the [Existing users] section and that new entry contains the data you entered in the text fields

        //run this three tests with 3 different data sets for fields "Name" and "Email Address"

    }


    @AfterClass
    public static void endTest()
    {
        report.flush();
    }
}
