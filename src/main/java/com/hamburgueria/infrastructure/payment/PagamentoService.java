package com.hamburgueria.infrastructure.payment;

public class PagamentoService {

    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor);
        return true;
    }
}