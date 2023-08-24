import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.TestBase;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AutoCompletePage;
import pages.DialogBoxesPage;
import pages.HomePage;
import pages.TabsPage;

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
        ExtentTest test = report.createTest("Create new user test - Test 1");
        test.log(Status.INFO, "Test 1 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        homePage.dialogBoxButton.scrollDownToElement();
        homePage.dialogBoxButton.click();

        DialogBoxesPage dialogBoxesPage = new DialogBoxesPage(driver);

        /* Can't close the ad I gave up
        driver.switchTo().frame(driver.findElement(By.id("id=aswift_1")));
        driver.findElement(By.xpath(dialogBoxesPage.dismissButton.getLocator())).click() ;

        if(dialogBoxesPage.createButtonInitialized()) {
            test.log(Status.INFO, "Dialog Boxes page is displayed");

        }
        else {
            test.log(Status.INFO, "Dialog Boxes page is NOT displayed");
        }

        closeDriver();

        //Remove all the text the form fields has
        /*dialogBoxesPage.name.clearField();
        dialogBoxesPage.email.clearField();
        dialogBoxesPage.password.clearField();
         */

    }

    @Test(description = "Test2")
    public void secondTest() {
        ExtentTest test = report.createTest("Select Section2 test - Test 2");
        test.log(Status.INFO, "Test 2 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        homePage.dialogBoxButton.scrollDownToElement();
        homePage.tabsButton.click();

        TabsPage tabsPage = new TabsPage(driver);
        //NOT WIRKING DUE TO iFrame elements
        /*if (tabsPage.sectionOneInitialized()) {
            test.log(Status.INFO, "Tabs page is visible");
        } else {
            test.log(Status.INFO, "Tabs page is NOT visible");
        }

        //Click on Section 2 tab
        tabsPage.secondSectionButton.click();*/

        //Validate that Section 2 is open/expanded and the text of the section is visible

        //log screenshot
        closeDriver();

    }

    @Test(description = "Test 3")
    private void thirdTest() {

        ExtentTest test = report.createTest("Random Value - Determine test - Test 3");
        test.log(Status.INFO, "Test 3 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        homePage.progressBarButton.scrollDownToElement();
        homePage.progressBarButton.click();

        closeDriver();
    }

    @Test(description = "Test 4")
    public void fourthTest() {
        ExtentTest test = report.createTest("Message Box test - Test 4");
        test.log(Status.INFO, "Test 4 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        homePage.dialogBoxButton.scrollDownToElement();
        homePage.dialogBoxButton.click();

        closeDriver();
    }

    @Test(description = "Test 5")
    public void fifthTest() {
        ExtentTest test = report.createTest("Search bar test - Test 5");
        test.log(Status.INFO, "Test 5 started");

        openAutoCompleteUrl();
        AutoCompletePage autoCompletePage = new AutoCompletePage(driver);

        if (autoCompletePage.searchFieldInitialized()) {
            test.log(Status.INFO, "Auto Complete page is visible");
        } else {
            test.log(Status.INFO, "Auto Complete is NOT visible");
        }


        autoCompletePage.searchField.setValue();
        autoCompletePage.andersAndersson.click();

        closeDriver();
    }

    @AfterClass
    public static void endTest()
    {
        report.flush();
    }
}
