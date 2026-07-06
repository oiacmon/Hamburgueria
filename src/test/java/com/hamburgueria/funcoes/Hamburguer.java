package com.hamburgueria.funcoes;


import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerEntityTest {

    @Test
    void deveCriarHamburguerComNomeEPrecoBase() {
        HamburguerEntity h = new HamburguerEntity("Cheeseburger", 12.0);

        assertEquals("Cheeseburger", h.getNome());
        assertEquals(12.0, h.getPreco());
    }

    @Test
    void deveAdicionarIngredientes() {
        HamburguerEntity h = new HamburguerEntity("X-Burger", 10.0);

        h.adicionarIngrediente(new IngredienteEntity("Queijo", 2.0));
        h.adicionarIngrediente(new IngredienteEntity("Carne", 5.0));

        assertEquals(2, h.getIngredientes().size());
        assertEquals("Queijo", h.getIngredientes().get(0).getNome());
        assertEquals("Carne", h.getIngredientes().get(1).getNome());
    }
}