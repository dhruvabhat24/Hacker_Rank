public static String superReducedString(String s) {
        String REGEX = "([a-z])\\1";
        String REGEX_FULL = String.format(".*%s.*", REGEX);

        while (s.matches(REGEX_FULL)) {
            s = s.replaceAll(REGEX, "");
        }

        return s.isEmpty() ? "Empty String" : s;
    }
