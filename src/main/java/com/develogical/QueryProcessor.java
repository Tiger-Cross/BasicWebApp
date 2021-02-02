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
        }

        if (query.toLowerCase().contains("theresa may")) {
            results.append("2017");
        }

        if (query.toLowerCase().contains("eiffel tower")) {
            results.append("Paris");
        }

        if (query.toLowerCase().contains("james bond") && query.toLowerCase().contains("dr no")) {
            results.append("Sean Connery");
        }

        if (query.toLowerCase().contains("plus")){
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

        if (query.toLowerCase().contains("both")
                && query.toLowerCase().contains("square")
                && query.toLowerCase().contains("cube")) {

            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);

            while (matcher.find()) {
                // Get the matching string
                String match = matcher.group();
                int testInt = Integer.parseInt(match);

                if (Math.sqrt(testInt) % 1 == 0 && Math.cbrt(testInt) % 1 == 0) {
                    results.append(testInt);
                }
            }
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

        if (query.toLowerCase().contains("prime")) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);
            ArrayList<Integer> ints = new ArrayList<>();
            while (matcher.find()) {
                // Get the matching string
                String match = matcher.group();
                Integer i = Integer.parseInt(match);
                boolean flag = false;
                for (int j = 2; j <= i / 2; ++j) {
                    // condition for nonprime number
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    ints.add(i);
                }
            }

            results.append(ints.toString());

        }

        if (results.length() == 0) {
            return "";
        }

        return results.toString();
    }
}
