package calculator;

class StringCalculator {
    private float result;
    private String customDelimiter;

    private static final String DEFAULT_DELIMITER = ",";
    private static final String NEWLINE = "\n";
    private static final String CUSTOM_DELIMITER_PREFIX = "/";
    private static final String CUSTOM_DELIMITER_SUFFIX = NEWLINE;

    StringCalculator() {
        result = 0;
        customDelimiter = "";
    }

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
}
