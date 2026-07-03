package com.hamburgueria.presentation;

import com.hamburgueria.application.facade.PedidoFacade;
import com.hamburgueria.application.services.NotificacaoService;
import com.hamburgueria.application.services.PedidoService;
import com.hamburgueria.application.services.PrecoService;
import com.hamburgueria.domain.entities.ClienteEntity;
import com.hamburgueria.domain.entities.ItemCardapio;
import com.hamburgueria.domain.entities.PedidoEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredientesTradicionaisFactory;
import com.hamburgueria.domain.observer.ClienteObserver;
import com.hamburgueria.domain.observer.CozinhaObserver;
import com.hamburgueria.domain.observer.PainelObserver;
import com.hamburgueria.domain.strategy.PrecoNormal;
import com.hamburgueria.domain.template.PreparoCheeseburger;

public class MainCLI {

    public static void main(String[] args) {

        PedidoFacade facade = new PedidoFacade();

        PedidoService pedidoService = new PedidoService(facade);
        PrecoService precoService = new PrecoService(facade);
        NotificacaoService notificacaoService = new NotificacaoService(facade);

        notificacaoService.registrarObserver(new CozinhaObserver());
        notificacaoService.registrarObserver(new PainelObserver());
        notificacaoService.registrarObserver(new ClienteObserver());

        ClienteEntity cliente = new ClienteEntity("Caio", "32 99999-9999");

        PedidoEntity pedido = pedidoService.criarPedido(1, cliente);

        ItemCardapio hamburguer = pedidoService.montarHamburguerPadrao(
                "Cheeseburger",
                10.0,
                new IngredientesTradicionaisFactory()
        );

        pedidoService.adicionarItem(pedido, hamburguer);

        double preco = precoService.calcular(pedido, new PrecoNormal());
        System.out.println("Preço final: R$ " + preco);

        pedidoService.prepararHamburguer(pedido, new PreparoCheeseburger());

        pedidoService.avancarEstado(pedido);
        pedidoService.avancarEstado(pedido);
        pedidoService.avancarEstado(pedido);
    }
}