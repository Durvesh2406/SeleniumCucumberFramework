# Selenium Cucumber Framework

![Java](https://img.shields.io/badge/Java-8+-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3+-orange.svg)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green.svg)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen.svg)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

A robust **test automation framework** built using **Selenium WebDriver**, **Cucumber (BDD)**, and **Java**. This framework is designed to support scalable, maintainable, and reusable automated tests with clear reporting and easy integration.

---

## 🚀 Features
- **Behavior-Driven Development (BDD)** with Cucumber for human-readable test scenarios.
- **Page Object Model (POM)** for modular and maintainable test design.
- **Cross-browser testing** support with Selenium WebDriver.
- **Reusable utilities** for handling waits, screenshots, and browser actions.
- **Configurable test execution** via property files.
- **Detailed reports** with Cucumber HTML reports.
- **Maven integration** for build and dependency management.

---

## 📂 Project Structure
```
SeleniumCucumberFramework/
│── src/
│   ├── main/java/
│   │   ├── base/          # Base classes and WebDriver setup
│   │   ├── pages/         # Page Object classes
│   │   ├── utils/         # Utility classes (waits, configs, etc.)
│   ├── test/java/
│   │   ├── stepDefinitions/ # Step definition files
│   │   ├── runners/         # Test runners
│   │   ├── features/        # Cucumber feature files
│── pom.xml                 # Maven dependencies
│── README.md               # Project documentation
```

---

## ⚙️ Prerequisites
- **Java JDK 8+**
- **Maven 3+**
- **IDE** (IntelliJ IDEA / Eclipse recommended)
- **Browser Drivers** (ChromeDriver, GeckoDriver, etc.)

---

## ▶️ Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/Durvesh2406/SeleniumCucumberFramework.git
cd SeleniumCucumberFramework
```

### 2. Install dependencies
```bash
mvn clean install
```

### 3. Run tests
```bash
mvn test
```

---

## 📝 Writing Tests
- Add new **feature files** under `src/test/java/features/`.
- Define **step definitions** in `src/test/java/stepDefinitions/`.
- Create or update **page objects** in `src/main/java/pages/`.

Example Feature:
```gherkin
Feature: Login functionality
  Scenario: Valid login
    Given user is on login page
    When user enters valid credentials
    Then user should be redirected to the dashboard
```

---

## 📊 Reports
After execution, Cucumber generates HTML reports:
- Default location: `target/cucumber-reports/`
- Open `index.html` in a browser to view results.

---

## 🔧 Configuration
- Update `config.properties` for:
  - Browser type (Chrome, Firefox, etc.)
  - Base URL
  - Timeout settings

---

## 🤝 Contributing
Contributions are welcome!  
- Fork the repo  
- Create a feature branch  
- Submit a pull request  

---

## 📜 License
This project is licensed under the MIT License.
