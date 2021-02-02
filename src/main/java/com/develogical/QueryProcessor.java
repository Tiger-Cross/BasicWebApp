package com.develogical;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        query = query.replace("%20", " ");
        StringBuilder results = new StringBuilder();

        if (query.toLowerCase().contains("your name")) {
            results.append("jtn");
            results.append(System.lineSeparator());
        }

        if (query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus")){
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);
            Integer sum = 0;
            while (matcher.find()) {
                // Get the matching string
                String match = matcher.group();
                sum += Integer.parseInt(match);
            }
            results.append(sum);
        }

        if (query.toLowerCase().contains("largest")) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);
            ArrayList<Integer> ints = new ArrayList<>();
            Integer max = -9999;
            while (matcher.find()) {
                // Get the matching string
                String match = matcher.group();
                Integer i = Integer.parseInt(match);
                if (i > max) {
                    max = i;
                }
            }

            results.append(max);
        }

        if (query.toLowerCase().contains("multiplied")) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);
            ArrayList<Integer> ints = new ArrayList<>();
            Integer product = 1;
            while (matcher.find()) {
                // Get the matching string
                String match = matcher.group();
                product *= Integer.parseInt(match);
            }
            results.append(product);
        }

        if (query.toLowerCase().contains("banana")) {
            results.append("yellow");
        }

        if (results.length() == 0) {
            return "";
        }

        return results.toString();
    }
}
