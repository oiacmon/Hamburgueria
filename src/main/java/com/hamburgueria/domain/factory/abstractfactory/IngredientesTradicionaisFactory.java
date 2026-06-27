package com.hamburgueria.domain.factory.abstractfactory;

import com.hamburgueria.domain.entities.IngredienteEntity;

public class IngredientesTradicionaisFactory implements IngredienteFactory {

    @Override
    public IngredienteEntity criarPao() {
        return new IngredienteEntity("Pão Tradicional", 1.5);
    }

    @Override
    public IngredienteEntity criarCarne() {
        return new IngredienteEntity("Carne Bovina", 5.0);
    }

    @Override
    public IngredienteEntity criarQueijo() {
        return new IngredienteEntity("Queijo Mussarela", 2.0);
    }

    @Override
    public IngredienteEntity criarMolho() {
        return new IngredienteEntity("Molho Especial", 1.0);
    }
}