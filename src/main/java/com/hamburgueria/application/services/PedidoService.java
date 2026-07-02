package com.hamburgueria.application.services;

import com.hamburgueria.application.facade.PedidoFacade;
import com.hamburgueria.domain.entities.ClienteEntity;
import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredienteFactory;
import com.hamburgueria.domain.template.PreparoHamburguerTemplate;

public class PedidoService {

    private PedidoFacade facade;

    public PedidoService(PedidoFacade facade) {
        this.facade = facade;
    }

    public PedidoEntity criarPedido(int id, ClienteEntity cliente) {
        return facade.criarPedido(id, cliente);
    }

    public void adicionarItem(PedidoEntity pedido, ItemCardapio item) {
        pedido.adicionarItem(item);
    }

    public ItemCardapio montarHamburguerPadrao(
            String nome,
            double precoBase,
            IngredienteFactory factory
    ) {
        return facade.montarHamburguerPadrao(nome, precoBase, factory);
    }

    public ItemCardapio montarHamburguerPersonalizado(
            String nome,
            double precoBase,
            IngredienteFactory factory,
            String extraNome,
            double extraPreco
    ) {
        return facade.montarHamburguerPersonalizado(nome, precoBase, factory, extraNome, extraPreco);
    }

    public void prepararHamburguer(PedidoEntity pedido, PreparoHamburguerTemplate preparo) {
        facade.prepararHamburguer(pedido, preparo);
    }

    public void avancarEstado(PedidoEntity pedido) {
        facade.avancarEstado(pedido);
    }
}