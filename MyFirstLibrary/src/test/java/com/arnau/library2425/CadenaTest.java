package com.arnau.library2425;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class CadenaTest {

    @Test
    public void testRetornaCaracterRandom() {
        // Cridem el mètode
        char resultat = Cadena.retornaCaracter();
        // Comprovem que estigui dins del rang esperat
        assertTrue(resultat >= ' ' && resultat <= '}');
    }

    @Test
    public void testRetornaCaracterAmbRangValid() {
        char minim = 'A';
        char maxim = 'Z';

        // Generem diversos caràcters per assegurar-nos que estan dins del rang
        for (int i = 0; i < 100; i++) {
            char resultat = Cadena.retornaCaracter(minim, maxim);
            assertTrue(resultat >= minim && resultat <= maxim, "El caràcter ha de ser dins del rang entre A i Z.");
        }
    }

    @Test
    public void testRetornaCaracterAmbRangInvertit() {
        char minim = 'Z';
        char maxim = 'A';

        // Generem diversos caràcters per assegurar-nos que estan dins del rang
        for (int i = 0; i < 100; i++) {
            char resultat = Cadena.retornaCaracter(minim, maxim);
            assertTrue(resultat >= 'A' && resultat <= 'Z', "El caràcter ha de ser dins del rang entre A i Z (rang invertit).");
        }
    }
}