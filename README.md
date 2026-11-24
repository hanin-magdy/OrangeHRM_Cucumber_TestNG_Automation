## OrangeHRM Cucumber TestNG Automation

Automated UI tests for the OrangeHRM demo application, built with Java, Selenium WebDriver, Cucumber (BDD), TestNG, and Maven.

## Project Overview

The project automates the login module of the OrangeHRM demo site using Behavior-Driven Development (BDD): 3 Gherkin scenarios with example data, 2 of them tagged @smoke, executed through TestNG runner classes.

## Key Technologies & Tools

* Language: Java (JDK 17+)
* Automation Tool: Selenium WebDriver
* BDD Framework: Cucumber
* Testing Framework: TestNG
* Build Tool: Maven

## Project Structure

```text
src/test/
 ├── java/
 │   ├── steps/           # Step definitions mapping Gherkin to Java code
 │   └── testRunners/     # TestNG runners (@CucumberOptions): Login, Smoke, Feature
 └── resources/
     ├── Features/        # 3 Gherkin feature files for the login module
     └── runner.xml       # TestNG suite
```

## Test Coverage

* Module: Login
* 3 scenarios, 2 of them tagged @smoke
* Runners: LoginRunner, SmokeRunner, FeatureRunner

## How to Run Tests ?

1.Open the project in IntelliJ IDEA.

2.Run any Test Runner class located under src/test/java/testRunners/ (e.g., SmokeRunner.java or LoginRunner.java).

3.Alternatively, right-click runner.xml or testng.xml and click Run.
