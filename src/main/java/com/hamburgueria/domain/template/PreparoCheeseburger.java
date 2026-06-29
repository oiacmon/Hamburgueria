package com.hamburgueria.domain.template;

public class PreparoCheeseburger extends PreparoHamburguerTemplate {

    @Override
    protected void pegarIngredientes() {
        System.out.println("Pegando pão, carne e queijo...");
    }

    @Override
    protected void grelharCarne() {
        System.out.println("Grelhando carne bovina...");
    }

    @Override
    protected void montarHamburguer() {
        System.out.println("Montando Cheeseburger...");
    }
}