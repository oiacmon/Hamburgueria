package com.hamburgueria.domain.decorator;

public class MolhoEspecial extends IngredienteExtraDecorator {

    public MolhoEspecial(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getNome() {
        return hamburguer.getNome() + " + Molho Especial";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 1.5;
    }
}