package com.hamburgueria.domain.state;

import com.hamburgueria.domain.entities.PedidoEntity;

public class PedidoCriado implements EstadoPedido {

    @Override
    public void proximoEstado(PedidoEntity pedido) {
        pedido.setEstado(new PedidoPreparando());
    }

    @Override
    public String getNomeEstado() {
        return "Criado";
    }
}