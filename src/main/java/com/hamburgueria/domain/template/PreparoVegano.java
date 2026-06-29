package com.hamburgueria.domain.template;

public class PreparoVegano extends PreparoHamburguerTemplate {

    @Override
    protected void pegarIngredientes() {
        System.out.println("Pegando pão vegano, hambúrguer de grão de bico e queijo vegano...");
    }

    @Override
    protected void grelharCarne() {
        System.out.println("Grelhando hambúrguer vegano...");
    }

    @Override
    protected void montarHamburguer() {
        System.out.println("Montando Hambúrguer Vegano...");
    }
}