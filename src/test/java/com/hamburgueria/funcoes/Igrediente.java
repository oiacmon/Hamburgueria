package com.hamburgueria.funcoes;

import com.hamburgueria.domain.entities.IngredienteEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredienteEntityTest {

    @Test
    void deveCriarIngredienteComNomeEPreco() {
        IngredienteEntity ing = new IngredienteEntity("Queijo", 2.5);

        assertEquals("Queijo", ing.getNome());
        assertEquals(2.5, ing.getPreco());
    }
}