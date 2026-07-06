package com.hamburgueria.funcoes;


import com.hamburgueria.domain.entities.ClienteEntity;
import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.PedidoEntity;
import com.hamburgueria.domain.state.PedidoCriado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEntityTest {

    @Test
    void deveCriarPedidoComClienteEEstadoInicial() {
        ClienteEntity cliente = new ClienteEntity("Caio", "9999-9999");
        PedidoEntity pedido = new PedidoEntity(1, cliente);

        assertEquals(1, pedido.getId());
        assertEquals("Caio", pedido.getCliente().getNome());
        assertTrue(pedido.getEstado() instanceof PedidoCriado);
    }

    @Test
    void deveAdicionarItensAoPedido() {
        ClienteEntity cliente = new ClienteEntity("Caio", "9999-9999");
        PedidoEntity pedido = new PedidoEntity(1, cliente);

        pedido.adicionarItem(new HamburguerEntity("X-Burger", 10.0));

        assertEquals(1, pedido.getItens().size());
        assertEquals("X-Burger", pedido.getItens().get(0).getNome());
    }
}
