package com.ifpb.modelo;

public class Imoveis {

    private String comodidade;
    private String qtdeComodos;
    private String imagens;
    private String Disponibilidade;
    private float valor;
    private Endereco endereco;

    public String getComodidade() {
        return comodidade;
    }

    public void setComodidade(String comodidade) {
        this.comodidade = comodidade;
    }

    public String getQtdeComodos() {
        return qtdeComodos;
    }

    public void setQtdeComodos(String qtdeComodos) {
        this.qtdeComodos = qtdeComodos;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    public String getDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
