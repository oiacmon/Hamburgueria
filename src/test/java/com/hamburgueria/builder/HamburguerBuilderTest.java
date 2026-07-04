package com.hamburgueria.builder;


import com.hamburgueria.domain.builder.HamburguerDirector;
import com.hamburgueria.domain.builder.HamburguerPersonalizadoBuilder;
import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredientesTradicionaisFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerBuilderTest {

    @Test
    void deveConstruirHamburguerPadrao() {
        HamburguerDirector director = new HamburguerDirector();
        HamburguerPersonalizadoBuilder builder = new HamburguerPersonalizadoBuilder();

        HamburguerEntity h = director.construirHamburguerPadrao(
                builder,
                "Cheeseburger",
                10.0,
                new IngredientesTradicionaisFactory()
        );

        assertEquals("Cheeseburger", h.getNome());
        assertTrue(h.getIngredientes().size() >= 4);
    }
}
