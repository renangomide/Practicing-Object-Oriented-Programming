package org.example;

public class CarteiraInvestimento {

    private double numCarteira;
    private double saldo;
    public CarteiraInvestimento(){}

    public CarteiraInvestimento(double numCarteira, double saldo){
        this.numCarteira = numCarteira;
        this.saldo = saldo;
    }
    public void setNumCarteira(double numCarteira) {
        this.numCarteira = numCarteira;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumCarteira() {
        return numCarteira;
    }
    public double getSaldo() {
        return saldo;
    }
}