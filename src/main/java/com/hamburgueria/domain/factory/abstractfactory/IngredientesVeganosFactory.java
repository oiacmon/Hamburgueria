package com.hamburgueria.domain.factory.abstractfactory;

import com.hamburgueria.domain.entities.IngredienteEntity;

public class IngredientesVeganosFactory implements IngredienteFactory {

    @Override
    public IngredienteEntity criarPao() {
        return new IngredienteEntity("Pão Vegano", 2.0);
    }

    @Override
    public IngredienteEntity criarCarne() {
        return new IngredienteEntity("Hambúrguer de Grão de Bico", 4.5);
    }

    @Override
    public IngredienteEntity criarQueijo() {
        return new IngredienteEntity("Queijo Vegano", 3.0);
    }

    @Override
    public IngredienteEntity criarMolho() {
        return new IngredienteEntity("Molho Vegano", 1.5);
    }
}