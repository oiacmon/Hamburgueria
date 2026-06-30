package com.hamburgueria.domain.observer;

import com.hamburgueria.domain.entities.PedidoEntity;
import java.util.ArrayList;
import java.util.List;

public class PedidoSubject {

    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificar(PedidoEntity pedido, String mensagem) {
        for (Observer obs : observers) {
            obs.atualizar(pedido, mensagem);
        }
    }
}