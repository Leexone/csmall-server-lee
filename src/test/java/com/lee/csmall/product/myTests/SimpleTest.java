package com.lee.csmall.product.myTests;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@Slf4j
@SpringBootTest
public class SimpleTest {

    @org.junit.jupiter.api.Test
    void testSlf4j() {
        int x = 5;
        int y = 6;
//        log.info("x + y" + "=" + (x + y) + "x =" + x + "y = " + y);
    }

    @org.junit.jupiter.api.Test
    void testLog() {
        int x = 6;
        int y = 7;
        log.info("x = {}, y = {}, x + y = {}", x, y, x + y);
    }

    @org.junit.jupiter.api.Test
    void logTest() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

    @Test
    void logTestSpring() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        int x = 5;
        int y = 6;
        log.info("x={},y={},x+y={}", x, y, x + y);
        System.out.println("x=" + x  + "y" + y);
    }

    @Test
   void log2() {
       int a = 6;
       int b = 6;
       log.debug("a={},b={},a + b ={}", a, b, a + b);
    }

}
