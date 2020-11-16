package com.exempel;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void String(){
        System.out.println("Testing..");
    }

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }

    @RepeatedTest(3)
    @DisplayName("Testing subtraction method three times.")
    void TestSub() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.sub(5, 5));
    }

    @Test
    void testMulti() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multi(5, 5));
    }

    @Test
    @Disabled
    @DisplayName("Disabled test, should not run. If run test will fail.")
    void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.div(100, 3));
    }

    @Test
    void testAssertTrue(){
        Calculator calculator = new Calculator();
        int summa1 = calculator.add(5,5);
        int summa2 = calculator.add(6,6);
        assertTrue(summa1 < summa2);
    }

    @Test
    void testCalculatorNotNull(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

}