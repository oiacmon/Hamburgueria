package com.hamburgueria.domain.factory.method;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;

public class DuploBaconFactory extends HamburguerCreator {

    @Override
    public HamburguerEntity criarHamburguer() {
        HamburguerEntity h = new HamburguerEntity("Duplo Bacon", 20.0);
        h.adicionarIngrediente(new IngredienteEntity("Carne", 0));
        h.adicionarIngrediente(new IngredienteEntity("Carne Extra", 3.0));
        h.adicionarIngrediente(new IngredienteEntity("Bacon", 3.0));
        h.adicionarIngrediente(new IngredienteEntity("Queijo Cheddar", 2.0));
        return h;
    }
}