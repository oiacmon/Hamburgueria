package com.hamburgueria.domain.decorator;

public class HamburguerBase implements Hamburguer {

    private String nome;
    private double preco;

    public HamburguerBase(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}