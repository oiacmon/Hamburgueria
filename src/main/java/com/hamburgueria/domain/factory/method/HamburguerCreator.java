package com.hamburgueria.domain.factory.method;

import com.hamburgueria.domain.entities.HamburguerEntity;

public abstract class HamburguerCreator {

    public abstract HamburguerEntity criarHamburguer();

    public HamburguerEntity montar() {
        HamburguerEntity hamburguer = criarHamburguer();
        return hamburguer;
    }
}