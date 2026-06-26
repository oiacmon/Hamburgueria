package com.hamburgueria.domain.entities;

public class ClienteEntity {

    private String nome;
    private String telefone;

    public ClienteEntity(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}