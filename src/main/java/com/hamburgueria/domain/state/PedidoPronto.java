package com.hamburgueria.domain.state;

import com.hamburgueria.domain.entities.PedidoEntity;

public class PedidoPronto implements EstadoPedido {

    @Override
    public void proximoEstado(PedidoEntity pedido) {
        pedido.setEstado(new PedidoEntregue());
    }

    @Override
    public String getNomeEstado() {
        return "Pronto";
    }
}