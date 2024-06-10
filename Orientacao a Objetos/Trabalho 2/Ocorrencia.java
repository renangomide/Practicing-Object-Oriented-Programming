package org.example;


//Renan Gomide
public class Ocorrencia {
    private int valorAcresicmo;

    private int valorDesconto;

    private String descricaoOcorrencia;

    public Ocorrencia(){

    }

    public Ocorrencia(int valorAcresicmo, int valorDesconto, String descricaoOcorrencia){
        this.valorAcresicmo = valorAcresicmo;
        this.valorDesconto = valorDesconto;
        this.descricaoOcorrencia = descricaoOcorrencia;
    }

    public int getValorAcresicmo() {
        return valorAcresicmo;
    }
    public void setValorAcresicmo(int valorAcresicmo) {
        this.valorAcresicmo = valorAcresicmo;
    }

    public int getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(int valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getDescricaoOcorrencia() {
        return descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }
}