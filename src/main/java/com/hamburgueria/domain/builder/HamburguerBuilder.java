package com.hamburgueria.domain.builder;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredienteFactory;

public interface HamburguerBuilder {

    void reset(String nome, double precoBase);
    void aplicarIngredientesBase(IngredienteFactory factory);
    void adicionarIngredienteExtra(String nome, double preco);
    HamburguerEntity build();
}