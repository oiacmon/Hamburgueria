package com.hamburgueria.domain.decorator;

public abstract class IngredienteExtraDecorator implements Hamburguer {

    protected Hamburguer hamburguer;

    public IngredienteExtraDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    @Override
    public String getNome() {
        return hamburguer.getNome();
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco();
    }
}