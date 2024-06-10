package org.example;

class BolsaValores extends CarteiraInvestimento {
    public BolsaValores(){}

    public BolsaValores(double numCarteira, double saldo){
        super(numCarteira,saldo);
    }

    public void investir(double valor){
        setSaldo(getSaldo()+valor-50);
    }
    public void retirar(double valor){
        if(getSaldo() >= valor){
            setSaldo(getSaldo()-valor);
        }
        else return;
    }
}