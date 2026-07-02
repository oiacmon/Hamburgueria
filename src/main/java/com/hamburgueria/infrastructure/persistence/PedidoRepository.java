package com.hamburgueria.infrastructure.persistence;

import com.hamburgueria.domain.entities.PedidoEntity;
import java.util.List;

public interface PedidoRepository {

    void salvar(PedidoEntity pedido);
    PedidoEntity buscarPorId(int id);
    List<PedidoEntity> listarTodos();
}