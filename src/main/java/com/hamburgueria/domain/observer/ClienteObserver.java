package com.hamburgueria.domain.observer;

import com.hamburgueria.domain.entities.PedidoEntity;

public class ClienteObserver implements Observer {

    @Override
    public void atualizar(PedidoEntity pedido, String mensagem) {
        System.out.println("[CLIENTE] Olá " + pedido.getCliente().getNome() +
                ", seu pedido #" + pedido.getId() + " está: " + mensagem);
    }
}