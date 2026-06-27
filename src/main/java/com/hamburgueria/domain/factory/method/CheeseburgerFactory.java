package com.hamburgueria.domain.factory.method;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;

public class CheeseburgerFactory extends HamburguerCreator {

    @Override
    public HamburguerEntity criarHamburguer() {
        HamburguerEntity h = new HamburguerEntity("Cheeseburger", 10.0);
        h.adicionarIngrediente(new IngredienteEntity("Carne", 0));
        h.adicionarIngrediente(new IngredienteEntity("Queijo", 2.0));
        return h;
    }
}