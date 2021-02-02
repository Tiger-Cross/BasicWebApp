package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        StringBuilder results = new StringBuilder();

        String[] queryWords = query.split(" ");

        if (query.toLowerCase().contains("your name")) {
            results.append("jtn");
            results.append(System.lineSeparator());
        }

        if (results.length() == 0) {
            return "";
        }

        return results.toString();
    }
}
