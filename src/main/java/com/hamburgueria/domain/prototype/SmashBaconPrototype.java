package com.hamburgueria.domain.prototype;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;

public class SmashBaconPrototype implements ReceitaPrototype {

    private HamburguerEntity base;

    public SmashBaconPrototype() {
        base = new HamburguerEntity("Smash Bacon", 18.0);
        base.adicionarIngrediente(new IngredienteEntity("Carne Smash", 0));
        base.adicionarIngrediente(new IngredienteEntity("Bacon", 3.0));
        base.adicionarIngrediente(new IngredienteEntity("Queijo Cheddar", 2.0));
    }

    @Override
    public HamburguerEntity clonar() {
        HamburguerEntity clone = new HamburguerEntity(base.getNome(), base.getPreco());
        base.getIngredientes().forEach(i -> clone.adicionarIngrediente(
                new IngredienteEntity(i.getNome(), i.getPreco())
        ));
        return clone;
    }
}