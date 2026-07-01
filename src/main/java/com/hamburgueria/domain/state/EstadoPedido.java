package com.hamburgueria.domain.state;

import com.hamburgueria.domain.entities.PedidoEntity;

public interface EstadoPedido {
    void proximoEstado(PedidoEntity pedido);
    String getNomeEstado();
}