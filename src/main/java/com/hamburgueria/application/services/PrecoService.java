package com.hamburgueria.application.services;

import com.hamburgueria.application.facade.PedidoFacade;
import com.hamburgueria.domain.entities.PedidoEntity;
import com.hamburgueria.domain.strategy.EstrategiaPreco;

public class PrecoService {

    private PedidoFacade facade;

    public PrecoService(PedidoFacade facade) {
        this.facade = facade;
    }

    public double calcular(PedidoEntity pedido, EstrategiaPreco estrategia) {
        return facade.calcularPreco(pedido, estrategia);
    }
}