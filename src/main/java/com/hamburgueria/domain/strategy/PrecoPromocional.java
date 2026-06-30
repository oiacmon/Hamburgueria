package com.hamburgueria.domain.strategy;

import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;

public class PrecoPromocional implements EstrategiaPreco {

    @Override
    public double calcular(PedidoEntity pedido) {
        double total = pedido.getItens().stream()
                .mapToDouble(ItemCardapio::getPreco)
                .sum();

        return total * 0.85; // 15% de desconto
    }
}