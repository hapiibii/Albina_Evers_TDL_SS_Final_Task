# Albina_Evers_TDL_SS_Final_Task

1. Firstly on the computer must be installed/downloaded maven and JDK to work with it. During the creation of the project user must chose from the Generators "Maven Archetype". In the field "Name:" must be entered the title ‘Name_Surname_TDL_SS_Final_Task’. User may choose the location for this project. As a Built system must be chosen "Maven". JDK - 11. On Archetype must be chosen first archetype displayed in the list. Version 1.0. In Advanced settings GroupId: org.demo. After creation there must be createn in the resource package a few new packages: 
- configs: for the config.properties
- in the configs extentreports: for the spark-config.xml
- drivers: for chromedriver.exe which must be inserten into the package
- reports: for TestReport.html
In the pom.xml file must me inserted properties, dependencies and build specially for automation. In Resources should be added testng.xml file.

2. Create a readMe file user can while creating a github repository, with a git code before the "git remote" with git add "ReadMe.md" or manually in the project directory.

3. In the test implementation were used objects from classes in "pages" and "objects" packages. 
Pages package classes:
 - AutoCompletePage.java
 - DialogBoxesPage.java
 - HomePage.java
 - ProgressBarPage.java
 - TabsPage.java
Objects package classes:
 - BasePageObject.java
 - Button.java
 - TextField.java
In "pages"'s package classes was created all the objects related to elements from the website. In "objects" package classes was created Constructors and functions that check if a WebElement is displayed or click, enter (into text field) or clear (text field value).

4. Extent report was successfully created and is in "/src/main/resources/reports/TestReport.html".

5. Smoke test:
    - Test 1 (Create new user)
    - Test 4 (Message box)
   Regression test:
    - Test 2 (Tabs - Section 2)
    - Test 3 (Progress bar - random color - random value)
    - Test 5 (Auto complete search)

6. Maven commands:
    6.1. mvn -Dtest=_TestClassName_ test - After the running this command, Maven locates and runs the test class with test methods in it. Really important to have the test class located in the correct directory (usually src/test/java).
    6.2. mvn -Dtest= _TestClassName_#_testMethodName_ test - This command sets the property "test" to the value of Selected Test class and Test method. After the running this command, Maven locates and runs the test method from selected test class. 
    6.3. mvn test -PSmoke - this code is used to execute tests in project (Maven) with specific group named "Smoke".Maven will activatre the "Smoke" profile.

7. The test of a configuration file is done during the test scenarios, usin ConficFileReader, TestBase and other classes.

8. 

9. 

10. 