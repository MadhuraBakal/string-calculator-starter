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
public String add(String input) {
         if (numbers.isEmpty())
            return String.format("%.0f", result);

        if (isInvalidLastCharacterIn(numbers))
            return "Number expected but EOF found.";

        if (numbers.startsWith(CUSTOM_DELIMITER_PREFIX))
            numbers = setCustomDelimiter(numbers);

        if (isNewlineAtInvalidPositionIn(numbers))
            return String.format("Number expected but '\n' found at position %d.", numbers.lastIndexOf('\n'));

        if (containsNegative(numbers).length() > 0)
            return String.format("Negative not allowed: %s", containsNegative(numbers));

        calculateSumOf(getStringArray(numbers));

        return hasDecimalPlaces() ? printFloat() : printInteger();
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
