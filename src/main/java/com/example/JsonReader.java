

package com.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    public List<EmailRequest> readFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("emailRequests.json");

        // If the file doesn't exist, return an empty list
        if (!file.exists()) {
            return new ArrayList<>();
        }

        // Read the list of EmailRequest objects from the JSON file
        return mapper.readValue(file, new TypeReference<List<EmailRequest>>() {});
    }
}
