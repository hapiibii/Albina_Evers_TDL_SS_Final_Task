# Albina_Evers_TDL_SS_Final_Task

----------Test 1----------
For the first test (Test 1) were created HomePage.java and DialogBoxesPage.java classes (which should be used for creating a new user in the Dialog Boxes page).
In the HomePage class was made one variable - a Button one which is related to a DialogBox element. HomePage class has constructor with driver, whis initializes the website.
Also in the HomePage class was made boolean type function which displays the result if page was loaded and th dialogBoxButton was displayed.

The first test uses the Button class objects. Button has its own constructor with the types from BasePageObject classes (name and locator). There are:
 - a WebElement function getWebElement() which is used to get the element through locator;
 - a void click() function that makes the click action to the Button object;
 - void scrollDownToElement() function, which scrolls the pahe to the selected object without JavaScriptExeptor;
 - boolean type isButtonPresent() function which checks if the button is displayed on the page.
 In the class Test1 the firstTest() function has ExtentText type variable to create a new user test and displays in the TestReport.html file the information about the test. For example, that test was started.
 The function opens the url from config.properties file with the openUrl() function and creates a new HomePage object. It check if the dialogBox button is displayed on the page and returns true/false. After the check it uses the scrollDownToElement() function to homePage.dialogBoxButton to scroll the page and with click() function to click on it and get to the next page (Dialog Boxes page).


 ----------Test 2----------
 For the second test (Test 2) were used already created HomePage.java and new TabsPage.java classes (which should be used for chechikg the Section 2 element in the Tabs page). In the HomePage class was made one variable - a Button one which is related to a Tabs element. 

 The second test uses the Button class objects.
 In the class Test1 the secondTest() function has ExtentTest type variable to create a new user test and displays in the TestReport.html file the information about the test. For example, that test was started.
 The function opens the url from config.properties file with the openUrl() function and creates a new HomePage object. It check if the dialogBox button is displayed on the page and returns true/false. After the check it uses the scrollDownToElement() function to homePage.dialogBoxButton to scroll the page and with click() function to the homePage.tabsButton object to click on it and get to the next page (Tabs page).


 ----------Test 3----------
 For the third test (Test 3) were used already created HomePage.java and new ProgressBarPage.java classes (which should be used for chechikg the Random Progress Bar element in the Tabs page). In the HomePage class was made one variable - a Button one which is related to a ProgressBar element. 

 The third test uses the Button class objects.
 In the class Test1 the thirdTest() function has ExtentTest type variable to create a new user test and displays in the TestReport.html file the information about the test. For example, that test was started.
 The function opens the url from config.properties file with the openUrl() function and creates a new HomePage object. It check if the dialogBox button is displayed on the page and returns true/false. After the check it uses the scrollDownToElement() function to homePage.progressBarButton to scroll the page and with click() function to the homePage.progressBarButton object to click on it and get to the next page (Tabs page).


 ----------Test 4----------
 For the fourth test (Test 4) were used already created HomePage.java and DialogBoxesPage.java classes (which should be used for checking the messages functionality in the Dialog Boxes page). In the HomePage class was made one variable - a Button one which is related to a DialogBox element. 

 The fourth test uses the Button class objects.
 In the class Test1 the fourthTest() function has ExtentTest type variable to create a new user test and displays in the TestReport.html file the information about the test. For example, that test was started.
 The function opens the url from config.properties file with the openUrl() function and creates a new HomePage object. It check if the dialogBox button is displayed on the page and returns true/false. After the check it uses the scrollDownToElement() function to homePage.dialogBoxButton to scroll the page and with click() function to the homePage.dialogBoxButton object to click on it and get to the next page (Dialog Boxes page).


 ----------Test 5----------
 For the fifth test (Test 5) were used a new AutoCompletePage.java class(which should be used for checking the search field functionality in the Auto Complete page). In the AutoComplete class were made two variables - a Button one which is related to a displayed search result and a TextField one which is related to a search field where has to be entered "and" elements. 

 The fifth test uses the Button class objects and TextField class objects.
 In the class Test1 the fifthTest() function has ExtentTest type variable to create a new user test and displays in the TestReport.html file the information about the test. For example, that test was started.
 The function opens the url from TestBase class with the openAutoCompleteUrl() function and creates a new AutoCompletePage object. It check if the search field is displayed on the page and returns true/false. After the check it sets the value to the search field and clicks to the "anders andersson".