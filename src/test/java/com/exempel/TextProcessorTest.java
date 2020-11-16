package com.exempel;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("This needs to run before all.");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Testing..");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests are completed");
    }

    @Test
    @DisplayName("Input word in uppercase letters.")
    void testToUpperCase() {
    }

    @Test
    @DisplayName("Input word in lowercase letters.")
    void testToLowerCase() {
    }

    @Test
    @DisplayName("Input word in reverse.")
    void testReverse() {
    }

    @Test
    void testTextProcessorNotNull(){
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull(textProcessor);
    }

}