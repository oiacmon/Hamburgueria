package com.hamburgueria.infrastructure.payment;

public class PagamentoCartaoAdapter {

    private PagamentoService pagamentoService;

    public PagamentoCartaoAdapter(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    public boolean pagarComCartao(String numeroCartao, double valor) {
        System.out.println("Validando cartão: " + numeroCartao);
        return pagamentoService.processarPagamento(valor);
    }
}