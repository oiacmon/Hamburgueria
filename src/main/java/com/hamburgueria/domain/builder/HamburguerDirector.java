package com.hamburgueria.domain.builder;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredienteFactory;

public class HamburguerDirector {

    public HamburguerEntity construirHamburguerPadrao(
            HamburguerBuilder builder,
            String nome,
            double precoBase,
            IngredienteFactory factory
    ) {
        builder.reset(nome, precoBase);
        builder.aplicarIngredientesBase(factory);
        return builder.build();
    }
}