package com.hamburgueria.domain.decorator;

public class QueijoExtra extends IngredienteExtraDecorator {

    public QueijoExtra(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getNome() {
        return hamburguer.getNome() + " + Queijo Extra";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 2.0;
    }
}