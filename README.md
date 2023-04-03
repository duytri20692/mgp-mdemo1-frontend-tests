#HOW TO RUN
1. Open the `command prompt` and cd until the project root directory.
2. Run test: 
- Run all test:
   `mvn test`
- Run Smoke test:
   `mvn test -Dcucumber.filter.tags="@SmokeTest"`
- Run Regression test:
   `mvn test -Dcucumber.filter.tags="@RegressionTest"`
- Run UAT test:
   `mvn test -Dcucumber.filter.tags="@UATTest"`