package com.hamburgueria.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class HamburguerEntity implements ItemCardapio {

    private String nome;
    private double precoBase;
    private List<IngredienteEntity> ingredientes = new ArrayList<>();

    public HamburguerEntity(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public void adicionarIngrediente(IngredienteEntity ingrediente) {
        ingredientes.add(ingrediente);
    }

    public List<IngredienteEntity> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return precoBase;
    }
}