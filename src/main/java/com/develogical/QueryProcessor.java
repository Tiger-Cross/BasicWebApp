package com.develogical;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        StringBuilder results = new StringBuilder();

        String[] queryWords = query.split(" ");

        if (query.toLowerCase().contains("your name")) {
            results.append("jtn");
            results.append(System.lineSeparator());
        }

        if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus")){
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);
            ArrayList<Integer> ints = new ArrayList<>();
            Integer sum = 0;
            while (matcher.find()) {
                // Get the matching string
                String match = matcher.group();
                sum += Integer.parseInt(match);
            }
            results.append(sum.toString());
            results.append(System.lineSeparator());
        }

        if (query.toLowerCase().contains("largest")) {
            String[] splittedQuery = query.split(" ");

            int largest = -9999;

            for (int i = 8; i < splittedQuery.length; i++) {
                String number = splittedQuery[i].replace(",", "");
                int j = Integer.parseInt(number);
                if (j > largest) {
                    largest = j;
                }
            }

            results.append(largest);
        }

        if (results.length() == 0) {
            return "";
        }

        return results.toString();
    }
}
