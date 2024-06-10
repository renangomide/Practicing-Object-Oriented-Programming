package org.example;

class Investimento extends CarteiraInvestimento {

    public Investimento(){}
    public Investimento(double numCarteira, double saldo){
        super(numCarteira,saldo);
    }
    public void investir(double valor){
        setSaldo(getSaldo()+valor);
    }
    public void retirar(double valor){
        if(getSaldo() >= (valor*1.01)){
            setSaldo(getSaldo()-valor-(valor*0.01));
        }
    }
}