package br.com.projeto2springboot.Projeto2.model;

public enum Sexo {

    FEMININO("FEMININO"),
    MASCULINO("MASCULINO");

    private String descricao ;


    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

