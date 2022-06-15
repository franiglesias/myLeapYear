package org.example.classic;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {

    private final ArrayList<String> separators;

    public StringCalculator() {
        separators = new ArrayList<>();
        separators.add("\n");
    }

    public int Add(String input) {
        if (Objects.equals(input, "")) {
            return 0;
        }

        input = stripSeparators(input);
        input = normalize(input);

        return calculate(getValidNumbers(input));
    }

    private int[] getValidNumbers(String input) {
        int[] nums = getNumbers(input);
        validate(nums);
        return nums;
    }

    private String stripSeparators(String input) {
        if (!input.startsWith("//")) {
            return input;
        }

        int cut = input.indexOf("\n") + 1;

        String numbers = input.substring(cut);
        String options = input.substring(2, cut - 1);

        stripSeparatorsFromOptions(options);

        return numbers;
    }

    private void stripSeparatorsFromOptions(String options) {
        Pattern p = Pattern.compile("\\[(.*?)]");
        Matcher m = p.matcher(options);

        boolean found = false;
        while (m.find()) {
            String match = m.group();
            match = match.substring(1, match.length() - 1);
            separators.add(match);
            found = true;
        }

        if (!found) {
            separators.add(options);
        }
    }

    private void validate(int[] input) {
        int[] negatives = Arrays.stream(input).filter(x -> x < 0).toArray();

        if (negatives.length <= 0) {
            return;
        }

        String str = Arrays.stream(negatives)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));

        throw new InvalidParameterException(String.format("negatives not allowed: %s", str));
    }

    private String normalize(String input) {
        for (String separator :
                separators) {
            input = input.replace(separator, ",");
        }
        return input;
    }

    private int calculate(int[] nums) {
        return Arrays.stream(nums).reduce(0,Integer::sum);
    }

    private int[] getNumbers(String input) {

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .filter(x -> x < 1000)
                .toArray();
    }
}
