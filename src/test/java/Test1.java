import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import common.TestBase;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

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
        ExtentTest test = report.createTest("Create new user test (smoke) - Test 1");
        test.log(Status.INFO, "Test 1 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }
        WebElement bottomAdvertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-anchor-status='displayed']");
        JavascriptExecutor jsExecutor = (JavascriptExecutor)getDriver();
        jsExecutor.executeScript("arguments[0].style.bottom = '-350px';", bottomAdvertisementBlock);

        homePage.dialogBoxButton.scrollDownToElement();
        homePage.dialogBoxButton.click();

        DialogBoxesPage dialogBoxesPage = new DialogBoxesPage(driver);

        WebElement advertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-ad-status='filled'][data-vignette-loaded='true']");
        jsExecutor.executeScript("arguments[0].style.display = 'none';", advertisementBlock);

        //need to be clicked again to load the Dialog Boxes Page
        homePage.dialogBoxButton.click();

        // !! Need to switch to other frame to get the create new user button
        // !! Need to check if it is the Dialog Boxes Page
        if(dialogBoxesPage.createButtonInitialized()) {
            test.log(Status.INFO, "Dialog Boxes Page is displayed");
        }
        else {
            test.log(Status.INFO, "Dialog Boxes Page is NOT displayed");
        }

        dialogBoxesPage.createNewUser.click();

        //Remove all the text the form fields has
        dialogBoxesPage.name.clearField();
        dialogBoxesPage.email.clearField();
        dialogBoxesPage.password.clearField();

        //Add the text for the fields
        dialogBoxesPage.name.setValue();
        dialogBoxesPage.email.setValue();
        dialogBoxesPage.password.setValue();

        //Validate that a new entry is shown in the [Existing users]

        closeDriver();
    }

    @Test(description = "Test2")
    public void secondTest() {
        ExtentTest test = report.createTest("Select Section2 test (regression) - Test 2");
        test.log(Status.INFO, "Test 2 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        WebElement bottomAdvertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-anchor-status='displayed']");
        JavascriptExecutor jsExecutor = (JavascriptExecutor)getDriver();
        jsExecutor.executeScript("arguments[0].style.bottom = '-350px';", bottomAdvertisementBlock);

        homePage.dialogBoxButton.scrollDownToElement();
        homePage.tabsButton.click();

        WebElement advertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-ad-status='filled'][data-vignette-loaded='true']");
        jsExecutor.executeScript("arguments[0].style.display = 'none';", advertisementBlock);

        TabsPage tabsPage = new TabsPage(driver);

        //Need to be clicked again to open the Tabs Page otherwise could test without it
        homePage.tabsButton.click();

        // !! Need to switch to the related frame, so it could be found by selectors
        if (tabsPage.sectionOneInitialized()) {
            test.log(Status.INFO, "Tabs page is visible");
        } else {
            test.log(Status.INFO, "Tabs page is NOT visible");
        }

        //Click on Section 2 tab
        tabsPage.secondSectionButton.click();

        //Validate that Section 2 is open/expanded and the text of the section is visible

        //log screenshot

        closeDriver();

    }

    @Test(description = "Test 3")
    private void thirdTest() throws InterruptedException {

        ExtentTest test = report.createTest("Random Value - Determine test (regression) - Test 3");
        test.log(Status.INFO, "Test 3 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        WebElement bottomAdvertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-anchor-status='displayed']");
        JavascriptExecutor jsExecutor = (JavascriptExecutor)getDriver();
        jsExecutor.executeScript("arguments[0].style.bottom = '-350px';", bottomAdvertisementBlock);

        homePage.progressBarButton.scrollDownToElement();
        homePage.progressBarButton.click();

        WebElement advertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-ad-status='filled'][data-vignette-loaded='true']");
        jsExecutor.executeScript("arguments[0].style.display = 'none';", advertisementBlock);

        homePage.progressBarButton.click();

        ProgressBarPage progressBarPage = new ProgressBarPage(driver);

        // Checking if the Progress Bar Page is displayed
        if(progressBarPage.randomProgressBarInitialized()) {
            test.log(Status.INFO, "Progress Bar Page is displayed");
        }
        else {
            test.log(Status.INFO, "Progress Bar Page is NOT displayed");
        }

        //Click on the [Random Progress Bar]
        progressBarPage.randomProgressBarSection.click();
        //TimeUnit.SECONDS.sleep(3);
        Thread.sleep(5000);

        //Click on the [Random Color] button
        progressBarPage.randomColorButton.click();

        //Click on the [Random Value - Determine] button
        progressBarPage.randomValueButton.click();

        //Log screenshot

        closeDriver();
    }

    @Test(description = "Test 4")
    public void fourthTest() throws InterruptedException {
        ExtentTest test = report.createTest("Message Box test (smoke) - Test 4");
        test.log(Status.INFO, "Test 4 started");

        openUrl();
        HomePage homePage = new HomePage(driver);

        //Check if Home Page is displayed
        if (homePage.dialogBoxButtonInitialized()) {
            test.log(Status.INFO, "Home page is visible");
        } else {
            test.log(Status.INFO, "Home page is NOT visible");
        }

        WebElement bottomAdvertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-anchor-status='displayed']");
        JavascriptExecutor jsExecutor = (JavascriptExecutor)getDriver();
        jsExecutor.executeScript("arguments[0].style.bottom = '-350px';", bottomAdvertisementBlock);

        //Click on the DialogBox button
        homePage.dialogBoxButton.scrollDownToElement();
        homePage.dialogBoxButton.click();

        WebElement advertisementBlock = getWebElement("css=ins[data-adsbygoogle-status='done'][data-ad-status='filled'][data-vignette-loaded='true']");
        jsExecutor.executeScript("arguments[0].style.display = 'none';", advertisementBlock);

        homePage.dialogBoxButton.click();

        DialogBoxesPage dialogBoxesPage = new DialogBoxesPage(driver);

        //Click on Message Box tab in Dialog Boxes Page
        dialogBoxesPage.messageBoxTab.click();

        Thread.sleep(5000);

        //Click on Ok button
        dialogBoxesPage.okButton.scrollDownToElement();
        dialogBoxesPage.okButton.click();

        //Validate that Message Box is no longer displayed

        //Click on tab Form

        //Click on tab Message Box

        //Validate that the Message box is no longer displayed

        closeDriver();
    }

    @Test(description = "Test 5")
    public void fifthTest() {
        ExtentTest test = report.createTest("Search bar test (regression) - Test 5");
        test.log(Status.INFO, "Test 5 started");

        openAutoCompleteUrl();
        AutoCompletePage autoCompletePage = new AutoCompletePage(driver);

        //Checks if Auto Complete Page is displayed
        if (autoCompletePage.searchFieldInitialized()) {
            test.log(Status.INFO, "Auto Complete page is visible");
        } else {
            test.log(Status.INFO, "Auto Complete is NOT visible");
        }

        // !! Need to switch to other frame to get the search field and offered autocompletion
        //Set the value in Search field
        autoCompletePage.searchField.setValue();

        //In dropdown menu select value 'anders andersson'
        autoCompletePage.andersAndersson.click();

        //Log screenshot

        closeDriver();
    }

    @AfterClass
    public static void endTest()
    {
        report.flush();
    }
}
