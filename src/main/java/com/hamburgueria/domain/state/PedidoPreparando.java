package com.hamburgueria.domain.state;

import com.hamburgueria.domain.entities.PedidoEntity;

public class PedidoPreparando implements EstadoPedido {

    @Override
    public void proximoEstado(PedidoEntity pedido) {
        pedido.setEstado(new PedidoPronto());
    }

    @Override
    public String getNomeEstado() {
        return "Preparando";
    }
}