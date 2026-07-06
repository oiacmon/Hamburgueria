package com.hamburgueria.funcoes;


import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.ItemCardapio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemCardapioTest {

    @Test
    void hamburguerEntityDeveImplementarItemCardapio() {
        ItemCardapio item = new HamburguerEntity("Hamburger Vegano", 15.0);

        assertEquals("Hamburger Vegano", item.getNome());
        assertEquals(15.0, item.getPreco());
    }
}