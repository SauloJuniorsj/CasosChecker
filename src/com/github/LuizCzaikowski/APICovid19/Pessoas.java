/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.LuizCzaikowski.APICovid19;

/**
 *
 * @author Saulo Jr
 */
public class Pessoas {
    
    private int posicao;
    private String dataInclude;
    private String classificacao;
    private int idade;
    private String sexo;
    private String encerramento;
    private String dataObito;

    public Pessoas(int posicao, String dataInclude, String classificacao, int idade, String sexo, String encerramento, String dataObito) {
        this.posicao = posicao;
        this.dataInclude = dataInclude;
        this.classificacao = classificacao;
        this.idade = idade;
        this.sexo = sexo;
        this.encerramento = encerramento;
        this.dataObito = dataObito;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getDataInclude() {
        return dataInclude;
    }

    public void setDataInclude(String dataInclude) {
        this.dataInclude = dataInclude;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEncerramento() {
        return encerramento;
    }

    public void setEncerramento(String encerramento) {
        this.encerramento = encerramento;
    }

    public String getDataObito() {
        return dataObito;
    }

    public void setDataObito(String dataObito) {
        this.dataObito = dataObito;
    }
}
