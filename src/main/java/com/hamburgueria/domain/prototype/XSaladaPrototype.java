package com.hamburgueria.domain.prototype;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;

public class XSaladaPrototype implements ReceitaPrototype {

    private HamburguerEntity base;

    public XSaladaPrototype() {
        base = new HamburguerEntity("X-Salada", 12.0);
        base.adicionarIngrediente(new IngredienteEntity("Alface", 0));
        base.adicionarIngrediente(new IngredienteEntity("Tomate", 0));
        base.adicionarIngrediente(new IngredienteEntity("Queijo", 2.0));
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