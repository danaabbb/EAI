
# Email Handler

This is a Java-based application that demonstrates JSON serialization/deserialization and report generation for an `EmailRequest` object. The application:

1. Creates an `EmailRequest` object.
2. Serializes it into a JSON file (`emailRequests.json`).
3. Deserializes the JSON back into an `EmailRequest` object.
4. Prints the details of the `EmailRequest` in the terminal.

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

## Classes

### 1. `EmailRequest`
Defines the `EmailRequest` object with the following fields:
- `to`: The recipient's email address.
- `subject`: The subject of the email.
- `body`: The body content of the email.

### 2. `JsonWriter`
Handles JSON serialization, converting an `EmailRequest` object into a `emailRequests.json` file.

### 3. `JsonReader`
Handles JSON deserialization, converting the `emailRequests.json` file back into an `EmailRequest` object (or multiple ones).

### 4. `App`
The main entry point. Orchestrates the serialization, deserialization, and terminal output.


---


