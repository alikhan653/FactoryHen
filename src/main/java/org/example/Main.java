package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("gradle.properties"));
        String countriesFilePath = properties.getProperty("file.path");

        Set<String> countries = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(countriesFilePath))) {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String country = scanner.next().trim().toUpperCase();
                countries.add(country);
            }
        }

        for (String country : countries) {
            Hen hen = HenFactory.getHen(country);
            System.out.println(hen.getDescription());
        }
    }
}