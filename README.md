
# Email Handler

This is a Java-based application that demonstrates JSON serialization/deserialization and report generation for an `EmailRequest` object. The application:

1. Creates an `EmailRequest` object.
2. Serializes it into a JSON file (`emailRequests.json`).
3. Deserializes the JSON back into an `EmailRequest` object.
4. Prints the details of the `EmailRequest` in the terminal.

---

## Features

- **JSON Serialization**: Converts an `EmailRequest` object into a JSON file.
- **JSON Deserialization**: Reads the JSON file and converts it back into an `EmailRequest` object.
- **Terminal Output**: Displays the details of the `EmailRequest` in a clean format.

---

## Prerequisites

- **Java**: Ensure Java (JDK 11 or later) is installed.
  ```bash
  java -version
  ```
- **Maven**: Ensure Maven is installed for managing dependencies and building the project.
  ```bash
  mvn -version
  ```

---

## Installation

1. Clone this repository or download the source code.
   ```bash
   git clone https://github.com/your-repository/email-handler.git
   cd email-handler
   ```

2. Build the project using Maven.
   ```bash
   mvn clean install
   ```

---

## Usage

### Running the Application

To run the application and see the output in the terminal:

```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

### Expected Output

After running, you will see the following output in the terminal:

```
Writing EmailRequest object to JSON...
JSON file created: emailRequest.json

Reading JSON file and deserializing...

--- Email Request Details ---
To: test@example.com
Subject: Hello
Body: This is a test email.
--------------------------------
```

---

## Project Structure

```
email-handler/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── App.java          # Main entry point
│   │   │           ├── EmailRequests.java # EmailRequest class definition
│   │   │           ├── JsonWriter.java   # JSON serialization logic
│   │   │           ├── JsonReader.java   # JSON deserialization logic
├── target/                                # Compiled classes and build artifacts
├── pom.xml                                # Maven configuration file
└── README.md                              # Project instructions (this file)
```

---

## Classes

### 1. `EmailRequest`
Defines the `EmailRequest` object with the following fields:
- `to`: The recipient's email address.
- `subject`: The subject of the email.
- `body`: The body content of the email.

### 2. `JsonWriter`
Handles JSON serialization, converting an `EmailRequest` object into a `emailRequests.json` file.

### 3. `JsonReader`
Handles JSON deserialization, converting the `emailRequest.json` file back into an `EmailRequest` object.

### 4. `App`
The main entry point. Orchestrates the serialization, deserialization, and terminal output.

---

## Dependencies

This project uses the following Maven dependencies:

```xml
<dependencies>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.13.3</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>2.0.9</version>
    </dependency>
</dependencies>
```

---


