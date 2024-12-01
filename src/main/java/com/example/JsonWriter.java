package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class JsonWriter {
    public void writeToJson(List<EmailRequest> emailRequests) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("emailRequests.json"), emailRequests);
    }
}
