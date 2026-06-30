package com.hamburgueria.domain.strategy;

import com.hamburgueria.domain.entities.PedidoEntity;

public interface EstrategiaPreco {
    double calcular(PedidoEntity pedido);
}