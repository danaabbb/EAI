package com.example;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JsonWriter writer = new JsonWriter();
        JsonReader reader = new JsonReader();
        HtmlReportWriter htmlReportWriter = new HtmlReportWriter();

        try {
            // Load existing EmailRequest objects from the JSON file
            List<EmailRequest> emailRequests = reader.readFromJson();

            boolean addMore = true;
            while (addMore) {
                // Prompt user for EmailRequest details
                System.out.println("Enter email recipient (To): ");
                String to = scanner.nextLine();

                System.out.println("Enter email subject: ");
                String subject = scanner.nextLine();

                System.out.println("Enter email body: ");
                String body = scanner.nextLine();

                // Add a new EmailRequest to the list
                EmailRequest request = new EmailRequest(to, subject, body);
                emailRequests.add(request);

                // Ask if the user wants to add more
                System.out.println("Do you want to add another email? (yes/no): ");
                String response = scanner.nextLine();
                addMore = response.equalsIgnoreCase("yes");
            }

            // Write the updated list of EmailRequest objects to JSON
            writer.writeToJson(emailRequests);
            System.out.println("All EmailRequest objects have been saved to emailRequests.json.");

            // Display all email requests in the terminal
            System.out.println("\nSaved Email Requests:");
            for (EmailRequest request : emailRequests) {
                System.out.println("To: " + request.getTo());
                System.out.println("Subject: " + request.getSubject());
                System.out.println("Body: " + request.getBody());
                System.out.println("---------------------------");
            }

            // Generate an HTML report for all email requests and open it in the browser
            htmlReportWriter.writeHtmlReport(emailRequests);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
