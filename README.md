# Project Test Execution

This project contains separate modules for different types of tests, including API tests, performance tests, and UI tests. Each test module has its own Maven configuration (`pom.xml`) located in its respective directory. Below are the commands to run each set of tests from the project's root directory.

## Running Tests

To run the tests for each module, use the following commands:

### API Tests
```bash
mvn -f api-tests/pom.xml clean test
```

### PERFORMANCE Tests
```bash
mvn -f performance-tests/pom.xml clean test
```

### UI Tests
```bash
mvn -f ui-tests/pom.xml clean test