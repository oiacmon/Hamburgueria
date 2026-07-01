package com.hamburgueria.application.facade;

import com.hamburgueria.domain.builder.HamburguerBuilder;
import com.hamburgueria.domain.builder.HamburguerDirector;
import com.hamburgueria.domain.builder.HamburguerPersonalizadoBuilder;
import com.hamburgueria.domain.decorator.*;
import com.hamburgueria.domain.entities.ClienteEntity;
import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredienteFactory;
import com.hamburgueria.domain.factory.method.HamburguerCreator;
import com.hamburgueria.domain.observer.PedidoSubject;
import com.hamburgueria.domain.strategy.EstrategiaPreco;
import com.hamburgueria.domain.template.PreparoHamburguerTemplate;

public class PedidoFacade {

    private HamburguerDirector director = new HamburguerDirector();
    private PedidoSubject subject = new PedidoSubject();

    public PedidoEntity criarPedido(int id, ClienteEntity cliente) {
        PedidoEntity pedido = new PedidoEntity(id, cliente);
        subject.notificar(pedido, "Pedido criado");
        return pedido;
    }

    public HamburguerEntity montarHamburguerPadrao(
            String nome,
            double precoBase,
            IngredienteFactory factory
    ) {
        HamburguerBuilder builder = new HamburguerPersonalizadoBuilder();
        return director.construirHamburguerPadrao(builder, nome, precoBase, factory);
    }

    public HamburguerEntity montarHamburguerPersonalizado(
            String nome,
            double precoBase,
            IngredienteFactory factory,
            String extraNome,
            double extraPreco
    ) {
        HamburguerBuilder builder = new HamburguerPersonalizadoBuilder();
        builder.reset(nome, precoBase);
        builder.aplicarIngredientesBase(factory);
        builder.adicionarIngredienteExtra(extraNome, extraPreco);
        return builder.build();
    }

    public ItemCardapio aplicarExtra(ItemCardapio item, String tipoExtra) {

        Hamburguer hamburguer = new HamburguerBase(item.getNome(), item.getPreco());

        return switch (tipoExtra.toLowerCase()) {
            case "bacon" -> new BaconExtra(hamburguer);
            case "queijo" -> new QueijoExtra(hamburguer);
            case "molho" -> new MolhoEspecial(hamburguer);
            default -> hamburguer;
        };
    }

    public double calcularPreco(PedidoEntity pedido, EstrategiaPreco estrategia) {
        double preco = estrategia.calcular(pedido);
        subject.notificar(pedido, "Preço calculado: R$ " + preco);
        return preco;
    }

    public void prepararHamburguer(PedidoEntity pedido, PreparoHamburguerTemplate preparo) {
        preparo.preparar();
        subject.notificar(pedido, "Hambúrguer preparado");
    }

    public void avancarEstado(PedidoEntity pedido) {
        pedido.avancarEstado();
        subject.notificar(pedido, "Estado atualizado para: " + pedido.getEstado().getNomeEstado());
    }

    public void adicionarObserver(Object observer) {
        subject.adicionarObserver((com.hamburgueria.domain.observer.Observer) observer);
    }
}