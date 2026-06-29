package com.hamburgueria.domain.template;

public abstract class PreparoHamburguerTemplate {

    public final void preparar() {
        pegarIngredientes();
        grelharCarne();
        montarHamburguer();
        embalar();
    }

    protected abstract void pegarIngredientes();
    protected abstract void grelharCarne();
    protected abstract void montarHamburguer();

    protected void embalar() {
        System.out.println("Hambúrguer embalado!");
    }
}