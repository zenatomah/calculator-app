package com.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started");

        Calculator calc = new Calculator();

        logger.info("10 + 5 = {}", calc.add(10, 5));
        logger.info("10 - 5 = {}", calc.subtract(10, 5));
        logger.info("10 * 5 = {}", calc.multiply(10, 5));
        logger.info("10 / 2 = {}", calc.divide(10, 2));

     
        logger.debug("This is a DEBUG message");

        try {
            calc.divide(10, 0);  
        } catch (ArithmeticException e) {
            logger.error("Calculation failed", e); 
        }

        logger.info("Application finished");
    }
}