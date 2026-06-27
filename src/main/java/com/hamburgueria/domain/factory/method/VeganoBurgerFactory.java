package com.hamburgueria.domain.factory.method;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;

public class VeganoBurgerFactory extends HamburguerCreator {

    @Override
    public HamburguerEntity criarHamburguer() {
        HamburguerEntity h = new HamburguerEntity("Vegano Burger", 14.0);
        h.adicionarIngrediente(new IngredienteEntity("Hambúrguer Vegano", 0));
        h.adicionarIngrediente(new IngredienteEntity("Alface", 0));
        h.adicionarIngrediente(new IngredienteEntity("Tomate", 0));
        return h;
    }
}