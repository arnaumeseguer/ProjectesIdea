package com.arnau.library2425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TempsTest {

    @Test
    void mostrar_returnsFormattedDate() {
        Temps temps = new Temps(24, 1, 2025);
        assertEquals("24/01/2025", temps.mostrar());
    }

    @Test
    void mostrar_returnsFormattedDateTime() {
        Temps temps = new Temps(24, 1, 2025, 14, 30, 45);
        assertEquals("24/01/2025 14-30-45", temps.mostrar());
    }

    @Test
    void modificar_updatesDateSuccessfully() {
        Temps temps = new Temps(24, 1, 2025);
        assertTrue(temps.modificar(25, 1, 2025));
        assertEquals("25/01/2025", temps.mostrar());
    }

    @Test
    void modificar_updatesDateTimeSuccessfully() {
        Temps temps = new Temps(24, 1, 2025, 14, 30, 45);
        assertTrue(temps.modificar(25, 1, 2025, 15, 45, 50));
        assertEquals("25/01/2025 15-45-50", temps.mostrar());
    }

    @Test
    void diaSeguent_returnsNextDay() {
        Temps temps = new Temps(24, 1, 2025);
        Temps dema = temps.diaSeguent();
        assertEquals("25/01/2025", dema.mostrar());
    }

    @Test
    void diaSeguent_returnsFirstDayOfNextMonth() {
        Temps temps = new Temps(31, 1, 2025);
        Temps dema = temps.diaSeguent();
        assertEquals("01/02/2025", dema.mostrar());
    }

    @Test
    void diaSeguent_returnsFirstDayOfNextYear() {
        Temps temps = new Temps(31, 12, 2025);
        Temps dema = temps.diaSeguent();
        assertEquals("01/01/2026", dema.mostrar());
    }

    @Test
    void comparaDates_returnsZeroForEqualDates() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(0, temps1.comparaDates(temps2));
    }

    @Test
    void comparaDates_returnsOneForFirstDateGreater() {
        Temps temps1 = new Temps(25, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(1, temps1.comparaDates(temps2));
    }

    @Test
    void comparaDates_returnsMinusOneForFirstDateLesser() {
        Temps temps1 = new Temps(23, 1, 2025);
        Temps temps2 = new Temps(24, 1, 2025);
        assertEquals(-1, temps1.comparaDates(temps2));
    }

    @Test
    void diferenciaDies_returnsCorrectDifference() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(25, 1, 2025);
        assertEquals(1, temps1.diferenciaDies(temps2));
    }

    @Test
    void diferenciaDies_returnsMinusOneForInvalidDate() {
        Temps temps1 = new Temps(24, 1, 2025);
        Temps temps2 = new Temps(30, 2, 2025);
        assertEquals(-1, temps1.diferenciaDies(temps2));
    }
}