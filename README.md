## OrangeHRM Cucumber TestNG Automation Framework

This repository contains an automated test framework built using Java, Selenium WebDriver, Cucumber (BDD), TestNG, and Maven.

 Project Overview
The main goal of this framework is to automate functional end-to-end scenarios for the OrangeHRM application using Behavior-Driven Development (BDD).

## Key Technologies & Tools

* Language: Java
* Automation Tool: Selenium WebDriver
* BDD Framework: Cucumber
* Testing Framework: TestNG
* Build Tool: Maven
* Design Pattern: Page Object Model (POM)
  

##  Project Structure

```text
src/
 ├── main/java/Pages/          # Page Object classes containing locators & actions
 └── test/
     ├── java/
     │   ├── steps/           # Step Definitions mapping Gherkin to Java code
     │   └── testRunners/     # TestNG Test Runners (@CucumberOptions)
     └── resources/
         ├── Features/        # Gherkin feature files (.feature)
         └── runner.xml       # TestNG XML suite runner
```

## How to Run Tests ?

​1.Open the project in IntelliJ IDEA.

​2.Run any Test Runner class located under src/test/java/testRunners/ (e.g., SmokeRunner.java or LoginRunner.java).

​3.Alternatively, right-click testng.xml or runner.xml and click Run.        
