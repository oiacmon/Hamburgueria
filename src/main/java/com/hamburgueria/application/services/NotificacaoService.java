package com.hamburgueria.application.services;

import com.hamburgueria.application.facade.PedidoFacade;
import com.hamburgueria.domain.observer.Observer;

public class NotificacaoService {

    private PedidoFacade facade;

    public NotificacaoService(PedidoFacade facade) {
        this.facade = facade;
    }

    public void registrarObserver(Observer observer) {
        facade.adicionarObserver(observer);
    }
}