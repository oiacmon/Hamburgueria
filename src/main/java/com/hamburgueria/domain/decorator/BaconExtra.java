package com.hamburgueria.domain.decorator;

public class BaconExtra extends IngredienteExtraDecorator {

    public BaconExtra(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getNome() {
        return hamburguer.getNome() + " + Bacon Extra";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 3.0;
    }
}