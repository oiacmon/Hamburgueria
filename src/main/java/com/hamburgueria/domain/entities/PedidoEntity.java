package com.hamburgueria.domain.entities;

import com.hamburgueria.domain.state.EstadoPedido;
import com.hamburgueria.domain.state.PedidoCriado;

import java.util.ArrayList;
import java.util.List;

public class PedidoEntity {

    private int id;
    private ClienteEntity cliente;
    private List<ItemCardapio> itens = new ArrayList<>();

    public PedidoEntity(int id, ClienteEntity cliente) {
        this.id = id;
        this.cliente = cliente;
        this.estado = new PedidoCriado();
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

    private EstadoPedido estado;

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void avancarEstado() {
        estado.proximoEstado(this);
    }

}