package com.hamburgueria.infrastructure.persistence;

import com.hamburgueria.domain.entities.PedidoEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryPedidoRepository implements PedidoRepository {

    private Map<Integer, PedidoEntity> banco = new HashMap<>();

    @Override
    public void salvar(PedidoEntity pedido) {
        banco.put(pedido.getId(), pedido);
    }

    @Override
    public PedidoEntity buscarPorId(int id) {
        return banco.get(id);
    }

    @Override
    public List<PedidoEntity> listarTodos() {
        return new ArrayList<>(banco.values());
    }
}
