package com.hamburgueria.domain.observer;

import com.hamburgueria.domain.entities.PedidoEntity;

public interface Observer {
    void atualizar(PedidoEntity pedido, String mensagem);
}