package com.arnau.library2425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class DataTest {

    @Test
    void esBixest_returnsTrueForLeapYear() {
        assertTrue(Data.esBixest(2020));
    }

    @Test
    void esBixest_returnsFalseForNonLeapYear() {
        assertFalse(Data.esBixest(2019));
    }

    @Test
    void dataCorrecta_returnsTrueForValidDate() {
        assertTrue(Data.dataCorrecta(29, 2, 2020));
    }

    @Test
    void dataCorrecta_returnsFalseForInvalidDate() {
        assertFalse(Data.dataCorrecta(30, 2, 2020));
    }

    @Test
    void diaSeguent_returnsNextDayForValidDate() {
        assertArrayEquals(new int[]{2, 1, 2020}, Data.diaSeguent(1, 1, 2020));
    }

    @Test
    void diaSeguent_returnsNextMonthForEndOfMonth() {
        assertArrayEquals(new int[]{1, 2, 2020}, Data.diaSeguent(31, 1, 2020));
    }

    @Test
    void diaSeguent_returnsNextYearForEndOfYear() {
        assertArrayEquals(new int[]{1, 1, 2021}, Data.diaSeguent(31, 12, 2020));
    }

    @Test
    void comparaDates_returnsZeroForEqualDates() {
        assertEquals(0, Data.comparaDates(new int[]{1, 1, 2020}, new int[]{1, 1, 2020}));
    }

    @Test
    void comparaDates_returnsOneForFirstDateGreater() {
        assertEquals(1, Data.comparaDates(new int[]{2, 1, 2020}, new int[]{1, 1, 2020}));
    }

    @Test
    void comparaDates_returnsMinusOneForFirstDateLesser() {
        assertEquals(-1, Data.comparaDates(new int[]{1, 1, 2020}, new int[]{2, 1, 2020}));
    }

    @Test
    void diferenciaDies_returnsCorrectDifferenceForValidDates() {
        assertEquals(1, Data.diferenciaDies(1, 1, 2020, 2, 1, 2020));
    }

    @Test
    void diferenciaDies_returnsMinusOneForInvalidDates() {
        assertEquals(-1, Data.diferenciaDies(30, 2, 2020, 1, 3, 2020));
    }
}