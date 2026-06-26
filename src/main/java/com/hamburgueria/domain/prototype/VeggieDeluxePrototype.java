package com.hamburgueria.domain.prototype;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;

public class VeggieDeluxePrototype implements ReceitaPrototype {

    private HamburguerEntity base;

    public VeggieDeluxePrototype() {
        base = new HamburguerEntity("Veggie Deluxe", 15.0);
        base.adicionarIngrediente(new IngredienteEntity("Hambúrguer de Grão de Bico", 0));
        base.adicionarIngrediente(new IngredienteEntity("Alface", 0));
        base.adicionarIngrediente(new IngredienteEntity("Tomate", 0));
        base.adicionarIngrediente(new IngredienteEntity("Molho Vegano", 1.5));
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