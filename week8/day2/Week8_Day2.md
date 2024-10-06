Why Framework?
--------------
    - Team of 4 members(QA)
    - uniformity
    - easy maintenance
    - scalable

How Framework is developed?
---------------------------
    - BrainStrom session (Stake holders, BA, Test Architecture, Test Lead, Scrum master)
    - What application is going to Test, env.., platform
    - looks for any existing Framework 
    - look for Framework in peer Team
    - look for open source Framework available
    - Atlast they design new Framework for the project
        ui - selenium , playwright, cypress, puppteer
        language binding - java, python, c#, ......
        mobile  - appium
        api - rest, soap
        design pattern - page object Model


Makaia Framework
----------------
base - common test steps for all the testcases
features - BDD --> feature file
pages --> testScript --> action for each WebElement in each pages
testcases/Runner --> testcase flow
utils --> DataLibrary (readExcel)


In Makaia Framework total no of package as 6 --> in these 6 package already we have known the 4 packages

selenium.api.design
--------------------
    Browser(I) --> findElement, findElements, getTitle, alert, frame, window, close, quit 
    Element(I) --> click, sendKeys, getText, isSelected, isEnabled, getAttribute, clear, ...........
    Locators(E) --> enum is constant 

selenium.api.base
-----------------
    DriverInstace(C) --> Driver and Wait with ThreadLocal implementation
    Selenium Base(C) --> Written the implementation for all the actions 

utils
-----
    DataLibrary(c) --> ReadExcel code
    Reporter(c) --> Report logic 

testng.api.base
--------------
    ProjectSpecificMethod - Common teststeps for all the testcases
    RetryEngine - to rerun the failed testcases automatically in Runtime

pages
-----
    - Design the Each WebPage and each actions

testcases
--------- 
    - Designed the flow of the testcase



How OOPs is implemented
-----------------------
    Inheritance - to reduce code duplication and redundcy
    Polymorphism - methodOverloading --> to perform same action in multiple way
    Abstarction - interface (Browser, Element), Abstract class(Reporter) - to hide the details to the user
    Encapsulation - ThreadLocal 

Hirerachy of the Framework
---------------------------
    AbstractTestNGCucumberTests (Cucumber)
        DriverInstance (selenium.api.base)
            Reporter(utils)
                SeleniumBase(selenium.api.base)
                    ProjectSpecificMethod(testng.api.base)
                        pages
                        testcases



Execution flow of the Framework(TestNG)
-------------------------------
    BeforeSuite--> startReport(Reporter)
        BeforeTest --> setValues(Testcase)
            BeforeClass --> startTestCase(Reporter)
                DataProvider --> fetchData(ProjectSpecificMethod)
                    BeforeMethod --> preCondition(ProjectSpecificMethod)
                        Test --> testcase
                    AfterMethod --> postCondition(ProjectSpecificMethod)
            AfterClass --> NA
        AfterTest --> NA
    AfterSuite --> endResult(Reporter)




Framework Explaination
-----------------------
 1(Highlevel - overview of the framework)
    - What kind of framework -- Hybrid framework
    - design pattern - page object Model
    - Selenium - ui Automation
    - Java - language binding
    - TestNG - Test execution flow / control the execution flow
    - Cucumber - BDD Automation
    - Apache poi - ReadExcel
    - ExtentReport - Html report 

2(components of the framework)
    - Browser(I) - Browser related actions are designed as unimplemented methods
    - Element(I) - Element related actions are designed as unimplemented methods
    - DriverInstance - ThreadLocal the driver and WebDriverWait is implementation for parallel execution to avoid thread conflicts
    - Reporter (Abstarct class) - Here the report related actions are written like start the report, start the testcase, end/close the report
    - SeleniumBase(wrapper class) - In selenium base the major actions for all the browser and Element actions are written as wrapper methods
    - ProjectSpecificMethod (Base class) - Where the common test steps for the all the testcases are written like to read test date from excel file, startApp, close the browser.
    - pages - where each action of the webpage is designed
    - testcases - where the testcase flow is designed

3. Hirerachy and Execution flow
        Hirerachy of the Framework
---------------------------
        AbstractTestNGCucumberTests (Cucumber)
            DriverInstance (selenium.api.base)
                Reporter(utils)
                    SeleniumBase(selenium.api.base)
                        ProjectSpecificMethod(testng.api.base)
                            pages
                            testcases



            Execution flow of the Framework(TestNG)
            -------------------------------
                BeforeSuite--> startReport(Reporter)
                    BeforeTest --> setValues(Testcase)
                        BeforeClass --> startTestCase(Reporter)
                            DataProvider --> fetchData(ProjectSpecificMethod)
                                BeforeMethod --> preCondition(ProjectSpecificMethod)
                                    Test --> testcase
                                AfterMethod --> postCondition(ProjectSpecificMethod)
                        AfterClass --> NA
                    AfterTest --> NA
                AfterSuite --> endResult(Reporter)

