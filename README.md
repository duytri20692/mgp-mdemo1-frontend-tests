#HOW TO RUN
1. Open the `command prompt` and cd until the project root directory.
2. Run test: 
- Run Smoke Test:
   `mvn test -Dcucumber.filter.tags="@SmokeTest"`
- Run Regression Test:
   `mvn test -Dcucumber.filter.tags="@RegressionTest"`
- Run All Test:
   `mvn clean test -DsuiteXmlFile=testng.xml`
  