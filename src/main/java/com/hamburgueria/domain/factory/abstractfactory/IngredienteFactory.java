package com.hamburgueria.domain.factory.abstractfactory;

import com.hamburgueria.domain.entities.IngredienteEntity;

public interface IngredienteFactory {

    IngredienteEntity criarPao();
    IngredienteEntity criarCarne();
    IngredienteEntity criarQueijo();
    IngredienteEntity criarMolho();
}