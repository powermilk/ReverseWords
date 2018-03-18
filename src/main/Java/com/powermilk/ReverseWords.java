package com.powermilk;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWordsInString(String inputString) {
        return Pattern
                .compile(" +")
                .splitAsStream(inputString)
                .map(splittedWord -> new StringBuilder(splittedWord).reverse())
                .collect(Collectors.joining(" "));
    }
}
