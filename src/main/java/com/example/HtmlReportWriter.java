package com.example;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.example.EmailRequest;

public class HtmlReportWriter {

    public void writeHtmlReport(List<EmailRequest> emailRequests) throws IOException {
        File htmlFile = new File("emailRequests.html");

        // Write the HTML content to the file
        try (FileWriter writer = new FileWriter(htmlFile)) {
            writer.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Email Requests</title>\n");
            writer.write("<style>table {width: 100%; border-collapse: collapse;} th, td {border: 1px solid black; padding: 8px; text-align: left;} th {background-color: #f2f2f2;}</style>\n");
            writer.write("</head>\n<body>\n");

            writer.write("<h1>Email Requests</h1>\n");
            writer.write("<table>\n");
            writer.write("<tr><th>To</th><th>Subject</th><th>Body</th></tr>\n");

            for (EmailRequest request : emailRequests) {
                writer.write("<tr>");
                writer.write("<td>" + request.getTo() + "</td>");
                writer.write("<td>" + request.getSubject() + "</td>");
                writer.write("<td>" + request.getBody() + "</td>");
                writer.write("</tr>\n");
            }

            writer.write("</table>\n");
            writer.write("</body>\n</html>");
        }

        // Open the HTML file in the default browser
        openInBrowser(htmlFile);
    }

    private void openInBrowser(File file) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(file.toURI());
            } else {
                System.out.println("Desktop browsing is not supported on this system.");
            }
        } catch (IOException e) {
            System.err.println("Failed to open HTML file in browser: " + e.getMessage());
        }
    }
}
