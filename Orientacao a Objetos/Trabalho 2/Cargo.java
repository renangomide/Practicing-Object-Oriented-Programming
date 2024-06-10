package org.example;


//Renan Gomide
public class Cargo {
    private int salarioBruto;

    public Cargo(){}
    public Cargo(int salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public int getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(int salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}