package com.hamburgueria.presentation;

import com.hamburgueria.application.facade.PedidoFacade;
import com.hamburgueria.application.services.PedidoService;
import com.hamburgueria.application.services.PrecoService;
import com.hamburgueria.domain.entities.ClienteEntity;
import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredienteFactory;
import com.hamburgueria.domain.strategy.EstrategiaPreco;
import com.hamburgueria.domain.template.PreparoHamburguerTemplate;

public class PedidoController {

    private PedidoService pedidoService;
    private PrecoService precoService;

    public PedidoController(PedidoFacade facade) {
        this.pedidoService = new PedidoService(facade);
        this.precoService = new PrecoService(facade);
    }

    public PedidoEntity criarPedido(int id, ClienteEntity cliente) {
        return pedidoService.criarPedido(id, cliente);
    }

    public void adicionarItem(PedidoEntity pedido, ItemCardapio item) {
        pedidoService.adicionarItem(pedido, item);
    }

    public ItemCardapio montarPadrao(String nome, double precoBase, IngredienteFactory factory) {
        return pedidoService.montarHamburguerPadrao(nome, precoBase, factory);
    }

    public double calcularPreco(PedidoEntity pedido, EstrategiaPreco estrategia) {
        return precoService.calcular(pedido, estrategia);
    }

    public void preparar(PedidoEntity pedido, PreparoHamburguerTemplate preparo) {
        pedidoService.prepararHamburguer(pedido, preparo);
    }

    public void avancarEstado(PedidoEntity pedido) {
        pedidoService.avancarEstado(pedido);
    }
}