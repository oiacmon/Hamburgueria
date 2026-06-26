package com.hamburgueria.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class ComboEntity implements ItemCardapio {

    private String nome;
    private List<ItemCardapio> itens = new ArrayList<>();

    public ComboEntity(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return itens.stream()
                .mapToDouble(ItemCardapio::getPreco)
                .sum();
    }
}