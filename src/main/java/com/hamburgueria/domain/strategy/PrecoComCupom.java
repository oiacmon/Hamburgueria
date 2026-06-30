package com.hamburgueria.domain.strategy;

import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;

public class PrecoComCupom implements EstrategiaPreco {

    private double valorDesconto;

    public PrecoComCupom(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcular(PedidoEntity pedido) {
        double total = pedido.getItens().stream()
                .mapToDouble(ItemCardapio::getPreco)
                .sum();

        return Math.max(0, total - valorDesconto);
    }
}