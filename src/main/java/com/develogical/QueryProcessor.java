package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        StringBuilder results = new StringBuilder();
        if (query.toLowerCase().contains("shakespeare")) {
            results.append(
                    "William Shakespeare (26 April 1564 - 23 April 1616) was an\n" +
                            "English poet, playwright, and actor, widely regarded as the greatest\n"
                            +
                            "writer in the English language and the world's pre-eminent dramatist. \n");
            results.append(System.lineSeparator());
        }

        if (query.toLowerCase().contains("asimov")) {
            results.append("Isaac Asimov (2 January 1920 - 6 April 1992) was an\n" +
                    "American writer and professor of Biochemistry, famous for\n" +
                    "his works of hard science fiction and popular science. \n");
            results.append(System.lineSeparator());
        }

        if (query.toLowerCase().contains("einstein")) {
            results.append("Albert Einstein (14 March 1879 –18 April 1955)\n"
                    + " was a German - born theoretical physicist who\n "
                    + "developed the theory of relativity, one of the two pillars\n"
                    + " of modern physics(alongside quantum mechanics).");
            results.append(System.lineSeparator());
        }

        if (results.length() == 0) {
            return "";
        }

        return results.toString();
    }
}
