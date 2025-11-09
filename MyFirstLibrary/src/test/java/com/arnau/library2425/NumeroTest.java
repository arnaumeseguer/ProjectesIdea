package com.arnau.library2425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class NumeroTest {

    @Test
    void demanaValor_returnsValueWithinRange() {
        int result = Numero.demanaValor("valor", 10);
        assertTrue(result >= 0 && result < 10);
    }

    @Test
    void sumaNaturals_iterativeReturnsCorrectSum() {
        assertEquals(15, Numero.sumaNaturals(5, false));
    }

    @Test
    void sumaNaturals_recursiveReturnsCorrectSum() {
        assertEquals(15, Numero.sumaNaturals(5, true));
    }

    @Test
    void sumaNaturals_returnsMinusOneForNegativeInput() {
        assertEquals(-1, Numero.sumaNaturals(-5, true));
    }

    @Test
    void vectorDigits_returnsCorrectDigitsForPositiveNumber() {
        assertArrayEquals(new int[]{1, 2, 3}, Numero.vectorDigits(123));
    }

    @Test
    void vectorDigits_returnsCorrectDigitsForNegativeNumber() {
        assertArrayEquals(new int[]{-1, 2, 3}, Numero.vectorDigits(-123));
    }

    @Test
    void vectorDigits_returnsCorrectDigitsForZero() {
        assertArrayEquals(new int[]{0}, Numero.vectorDigits(0));
    }

    @Test
    void numVector_returnsCorrectNumberForPositiveDigits() {
        assertEquals(123, Numero.numVector(new int[]{1, 2, 3}));
    }

    @Test
    void numVector_returnsCorrectNumberForNegativeDigits() {
        assertEquals(-123, Numero.numVector(new int[]{-1, 2, 3}));
    }

    @Test
    void numVector_returnsZeroForNullInput() {
        assertEquals(0, Numero.numVector(null));
    }

    @Test
    void numVector_returnsZeroForEmptyArray() {
        assertEquals(0, Numero.numVector(new int[]{}));
    }
}