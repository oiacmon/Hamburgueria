package com.hamburgueria.domain.observer;

import com.hamburgueria.domain.entities.PedidoEntity;

public class CozinhaObserver implements Observer {

    @Override
    public void atualizar(PedidoEntity pedido, String mensagem) {
        System.out.println("[COZINHA] Pedido #" + pedido.getId() + ": " + mensagem);
    }
}