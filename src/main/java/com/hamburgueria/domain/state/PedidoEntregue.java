package com.hamburgueria.domain.state;

import com.hamburgueria.domain.entities.PedidoEntity;

public class PedidoEntregue implements EstadoPedido {

    @Override
    public void proximoEstado(PedidoEntity pedido) {
        System.out.println("Pedido já foi entregue. Não há próximo estado.");
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}