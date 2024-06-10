package org.example;

import java.util.Date;

//Renan Gomide

public class Dependente extends Pessoa{

    private TesteData dataDeNascimento;
    public Dependente(){}

    public Dependente(TesteData dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public TesteData getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(TesteData dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}