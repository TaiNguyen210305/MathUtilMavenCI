/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huutai.mathutil.core;

/**
 *
 * @author nk
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathUtilTest {

    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1, MathUtil.getFactorial(0));
    }

    @Test
    void factorialOfFiveIs120() {
        assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    void factorialOfTwentyIsCorrect() {
        assertEquals(
                2_432_902_008_176_640_000L,
                MathUtil.getFactorial(20));
    }

    @Test
    void negativeNumberThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-1));
    }

    @Test
    void numberAboveTwentyThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtil.getFactorial(21));
    }
}