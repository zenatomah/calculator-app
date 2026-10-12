package com.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class CalculatorTest {
@Test
void testAddPositiveNumbers() {
Calculator calc = new Calculator();
assertEquals(5, calc.add(2, 3));
}
@Test
void testAddWithZero() {
Calculator calc = new Calculator();
assertEquals(7, calc.add(7, 0));
}
@Test
void testAddNegativeNumbers() {

Calculator calc = new Calculator();
assertEquals(-8, calc.add(-3, -5));

}
}