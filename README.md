# my-quickstart-project

This is a simple Maven-based Java project that demonstrates basic application structure and unit testing.

## Project Structure

- `src/main/java/com/example/App.java`: The main application class with a greeting and a square root calculation method.
- `src/test/java/com/example/AppTest.java`: Unit tests for the `App` class using JUnit.
- `pom.xml`: Maven project configuration file.

## Technologies Used

*   **Java 8**: Programming language.
*   **Maven**: Build automation tool.
*   **JUnit 4**: Unit testing framework.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

*   Java Development Kit (JDK) 8 or later
*   Apache Maven 3.x

### Building the Project

To compile the project and package it into a JAR file, navigate to the `my-quickstart-project` directory and run:

```bash
mvn clean install
```

### Running the Application

After building, you can run the main application from the target directory:

```bash
java -cp target/my-quickstart-project-1.0-SNAPSHOT.jar com.example.App
```

This will print "Hello World!" to the console.

### Running Tests

To execute the unit tests, navigate to the `my-quickstart-project` directory and run:

```bash
mvn test
```

This will run `AppTest.java` and report the test results.

## Usage

The `App` class provides a simple `getGreeting()` method and a `squareRoot()` method.

```java
package com.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public double squareRoot(double number) {
        // ... implementation ...
        return Math.sqrt(number);
    }

    public static void main( String[] args ) {
        App app = new App();
        System.out.println( app.getGreeting() );
        System.out.println( "Square root of 9 is: " + app.squareRoot(9) );
    }
}
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
