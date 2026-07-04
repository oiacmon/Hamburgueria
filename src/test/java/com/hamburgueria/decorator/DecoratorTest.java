package com.hamburgueria.decorator;

import com.hamburgueria.domain.decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void deveAdicionarBaconExtra() {
        Hamburguer h = new HamburguerBase("X-Burger", 10.0);
        h = new BaconExtra(h);

        assertEquals("X-Burger + Bacon Extra", h.getNome());
        assertEquals(13.0, h.getPreco());
    }
}