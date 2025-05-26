# Student Analyzer

This Java application provides utility methods to analyze a list of student scores. It includes functionality to:

- Count the number of excellent students (scores from 8.0 to 10.0).
- Calculate the average of valid scores (scores from 0.0 to 10.0).

It also includes a comprehensive JUnit test suite to validate these functionalities.

## Project Structure
student-analyzer/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/example/studentanalyzer/
│ │ └── StudentAnalyzer.java
│ └── test/
│ └── java/
│ └── com/example/studentanalyzer/
│ └── StudentAnalyzerTest.java
└── README.md

## Features

### 1. `countExcellentStudents(List<Double> scores)`
- Returns the count of students with scores between 8.0 and 10.0 (inclusive).
- Ignores `null` and invalid values.

### 2. `calculateValidAverage(List<Double> scores)`
- Returns the average of valid scores between 0.0 and 10.0.
- Ignores `null` and invalid values.
- Returns 0.0 if no valid scores are found.

## Testing

Unit tests are written using **JUnit 5**.

### Test Coverage Includes:
- Empty list
- All invalid scores
- Mixed valid and invalid values
- Boundary conditions
- Lists with `null` elements

## How to Run Tests

### Prerequisites
- Java 8 or higher
- Maven (or your favorite build tool)
- JUnit 5

### Using Maven

1. Open a terminal at the root of the project.
2. Run the tests with the following command:

```bash
mvn test
Using IDE (IntelliJ IDEA, Eclipse, etc.)
Import the project as a Maven project.

Navigate to StudentAnalyzerTest class in src/test/java/com/example/studentanalyzer/.

Right-click on the class and select Run 'StudentAnalyzerTest'.



## 🐛 Identified and Resolved Issues

| Issue ID | Description                                                | Status    |
|----------|------------------------------------------------------------|-----------|
| #1       | NullPointerException when the input list is `null`         | ✅ Fixed  |
| #2       | `countExcellentStudents` did not handle `null` elements    | ✅ Fixed  |
| #3       | Inconsistent score range handling between methods          | ✅ Fixed  |
| #4       | Missing test case for `null` elements in the list          | ✅ Added  |

---

## 📈 Test Coverage

Test coverage was measured using **JaCoCo**.

| Class              | Line Coverage | Branch Coverage |
|--------------------|---------------|-----------------|
| StudentAnalyzer     | 100%          | 100%            |
| StudentAnalyzerTest | 100%          | N/A             |

✅ All lines and conditional branches in the main class are fully covered by the unit tests.
