#HOW TO RUN
1. Open the `command prompt` and cd until the project root directory.
2. Run test: 
- Run all test:
   `mvn test`
- Run invalid test:
   `mvn test -Dcucumber.filter.tags="@SubmitAnInvalidApplication"`
- Run valid test:
   `mvn test -Dcucumber.filter.tags="@SubmitAnApplication"`