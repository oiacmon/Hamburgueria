package com.hamburgueria.domain.prototype;

import com.hamburgueria.domain.entities.HamburguerEntity;

public interface ReceitaPrototype {
    HamburguerEntity clonar();
}