package com.hamburgueria.domain.strategy;

import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;

public class PrecoNormal implements EstrategiaPreco {

    @Override
    public double calcular(PedidoEntity pedido) {
        return pedido.getItens().stream()
                .mapToDouble(ItemCardapio::getPreco)
                .sum();
    }
}