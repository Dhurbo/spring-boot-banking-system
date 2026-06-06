# Banking System Web

A clean Spring Boot web application that simulates essential banking operations through a simple browser-based interface. The project demonstrates MVC architecture, server-side rendering with Thymeleaf, service-layer business logic, and form-driven user interactions.

## Project Highlights

- Built with Java 17 and Spring Boot 3
- Uses Thymeleaf for dynamic server-rendered pages
- Implements basic banking operations: deposit, withdraw, balance view, and account switching
- Separates controller, service, and model responsibilities
- Includes Maven Wrapper for consistent local setup
- Lightweight project structure, suitable for learning, demos, and interview discussions

## Features

- View the currently selected bank account
- Display real-time account balance after transactions
- Deposit money into the active account
- Withdraw money with insufficient-funds validation
- Switch between predefined demo accounts
- Render banking data dynamically in the browser

## Tech Stack

| Layer | Technology |
| --- | --- |
| Language | Java 17 |
| Backend | Spring Boot 3.4.1 |
| Web MVC | Spring Web |
| Templates | Thymeleaf |
| Build Tool | Maven |
| Testing | JUnit, Spring Boot Test |

## Architecture

The application follows a simple MVC-style structure:

```text
Browser
  -> BankingController
  -> BankAccountService
  -> BankAccount model
  -> Thymeleaf view
```

### Core Components

| Component | Responsibility |
| --- | --- |
| `BankingController` | Handles web routes and form submissions |
| `BankAccountService` | Manages account state and banking operations |
| `BankAccount` | Represents account number and balance data |
| `index.html` | Displays account information and banking forms |

## Project Structure

```text
banking-system-web/
+-- src/
|   +-- main/
|   |   +-- java/com/example/banking_system_web/
|   |   |   +-- BankAccount.java
|   |   |   +-- BankAccountService.java
|   |   |   +-- BankingController.java
|   |   |   +-- BankingSystemWebApplication.java
|   |   +-- resources/
|   |       +-- templates/index.html
|   |       +-- static/index.html
|   |       +-- application.properties
|   +-- test/
|       +-- java/com/example/banking_system_web/
|           +-- BankingSystemWebApplicationTests.java
+-- pom.xml
+-- mvnw
+-- mvnw.cmd
+-- README.md
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven, or use the included Maven Wrapper

### Run Locally

On Windows:

```bash
mvnw.cmd spring-boot:run
```

On macOS/Linux:

```bash
./mvnw spring-boot:run
```

Open the application in your browser:

```text
http://localhost:8080
```

## Available Routes

| Method | Route | Description |
| --- | --- | --- |
| `GET` | `/` | Displays the banking dashboard |
| `POST` | `/deposit` | Deposits money into the active account |
| `POST` | `/withdraw` | Withdraws money from the active account |
| `POST` | `/switchAccount` | Switches between demo accounts |

## Demo Accounts

| Account Number | Starting Balance |
| --- | --- |
| `123456` | `$1000` |
| `789012` | `$500` |

## Testing

Run the test suite with:

```bash
mvnw.cmd test
```

For macOS/Linux:

```bash
./mvnw test
```

## What This Project Demonstrates

- Understanding of Spring Boot application structure
- MVC routing and server-side page rendering
- Form handling with `@PostMapping` and `@RequestParam`
- Service-layer design for business logic
- Basic exception handling for invalid withdrawal attempts
- Clean separation between data model, controller, and view

## Future Enhancements

- Add persistent database storage with Spring Data JPA
- Add user authentication and session-based account access
- Improve transaction history tracking
- Add validation for negative or zero transaction amounts
- Display user-friendly error messages on failed withdrawals
- Add responsive styling for a modern banking dashboard UI

## Author

Developed as a Spring Boot banking system project to demonstrate backend fundamentals, MVC design, and practical Java web development skills.
