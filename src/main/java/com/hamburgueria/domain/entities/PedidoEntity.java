package com.hamburgueria.domain.entities;

import java.util.ArrayList;
import java.util.List;

public class PedidoEntity {

    private int id;
    private ClienteEntity cliente;
    private List<ItemCardapio> itens = new ArrayList<>();

    public PedidoEntity(int id, ClienteEntity cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }
}