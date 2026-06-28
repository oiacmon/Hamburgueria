package com.hamburgueria.domain.builder;

import com.hamburgueria.domain.entities.HamburguerEntity;
import com.hamburgueria.domain.entities.IngredienteEntity;
import com.hamburgueria.domain.factory.abstractfactory.IngredienteFactory;

public class HamburguerPersonalizadoBuilder implements HamburguerBuilder {

    private HamburguerEntity hamburguer;

    @Override
    public void reset(String nome, double precoBase) {
        hamburguer = new HamburguerEntity(nome, precoBase);
    }

    @Override
    public void aplicarIngredientesBase(IngredienteFactory factory) {
        hamburguer.adicionarIngrediente(factory.criarPao());
        hamburguer.adicionarIngrediente(factory.criarCarne());
        hamburguer.adicionarIngrediente(factory.criarQueijo());
        hamburguer.adicionarIngrediente(factory.criarMolho());
    }

    @Override
    public void adicionarIngredienteExtra(String nome, double preco) {
        hamburguer.adicionarIngrediente(new IngredienteEntity(nome, preco));
    }

    @Override
    public HamburguerEntity build() {
        return hamburguer;
    }
}