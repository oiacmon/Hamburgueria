package com.hamburgueria.domain.observer;

import com.hamburgueria.domain.entities.PedidoEntity;

public class PainelObserver implements Observer {

    @Override
    public void atualizar(PedidoEntity pedido, String mensagem) {
        System.out.println("[PAINEL] Pedido #" + pedido.getId() + ": " + mensagem);
    }
}