package com.powermilk;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
@DisplayName("Testing ReverseWords class")
@SelectPackages("com.powermilk")
class ReverseWordsTest {
    private static Logger log = LoggerFactory.getLogger(ReverseWordsTest.class);

    @BeforeAll
    static void setup() {
        log.info("--- Test suite for Factorial class started! ---");
    }

    @BeforeEach
    void init() {
        log.info("Test started!");
    }

    @AfterAll
    static void finish() {
        log.info("--- Test suite for ReverseWords class finished! ---");
    }

    @AfterEach
    void tearDown() {
        log.info("Test finished!");
    }

    @Test
    @DisplayName("Test should returns a reversed 'Hello World' sentence")
    void shouldReturnReversedHelloWorld() {
        String expected = "olleH dlroW";
        String actual = ReverseWords.reverseWordsInString("Hello World");
        assertEquals(expected, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should returns a reversed 'we test coders' sentence")
    void shouldReturnReversedWeTestCoders() {
        String expected = "ew tset sredoc";
        String actual = ReverseWords.reverseWordsInString("we test coders");
        assertEquals(expected, actual);
        log.info("Test passed!");
    }

    @Test
    @DisplayName("Test should returns a reversed 'we test     coders' sentence (spaces should removed)")
    void shouldReturnReversedWeTestCodersWithSpaces() {
        String expected = "ew tset sredoc";
        String actual = ReverseWords.reverseWordsInString("we test     coders");
        assertEquals(expected, actual);
        log.info("Test passed!");
    }
}