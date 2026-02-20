package com.sgp.model;

public class Pessoa{

    private String nome;
    private int idade;

    //Construtor da classe
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Construtor padrao
    public Pessoa(){
        this.nome = "Teste";
        this.idade = 20;
    }

    public void saudacao(){
        System.out.println("Ola, " + nome + " Voce tem "+ idade + " anos. ")

    }

    //Gatters e Setters

    //GET para alterar o atributo privado
    public String getNome(){
        return nome;
    }
    //Set paraalterar o  atributo privado
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override //sobrescrita do toString para representacao textual
    public String toString(){

    }
        return"Pessoa [nome = " + nome + ", idade = " + idade + "]";
    
}