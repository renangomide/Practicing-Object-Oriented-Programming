package org.example;
import java.util.List;
import java.util.ArrayList;

//Renan Gomide

public class Funcionario extends Pessoa{

    private Cargo cargo;

    private TesteData data;

    private List<Ocorrencia> ocorrencias;

    private List<Dependente> dependentes;

    public Funcionario() {
    }

    public Funcionario(String nome,Cargo cargo, TesteData data){
        super(nome);
        this.cargo = cargo;
        this.data = data;
        this.dependentes = new ArrayList<>();
        this.ocorrencias = new ArrayList<>();
    }

    public int calcularSalarioLiquido(int ano, int mes){
    int valorOcorrencias = 0;
    int salario = cargo.getSalarioBruto();
    for(Ocorrencia ocorrencia : ocorrencias){
        if(ocorrencia.getDescricaoOcorrencia().equals("Bonus")){
            valorOcorrencias = valorOcorrencias + ocorrencia.getValorAcresicmo();
        }
        else{valorOcorrencias = valorOcorrencias - ocorrencia.getValorDesconto();}
    }
    for(Dependente dependente : dependentes){
        if(data.getAnoData() - dependente.getDataDeNascimento().getAnoData() < 18){
            salario = salario + 100;
        }
    }
    return salario + valorOcorrencias;
    }

    public List<String> dependentesFuncionario(){
        List<String> dependentesFuncionario = new ArrayList<>();
        for(Dependente dependente : dependentes){
                dependentesFuncionario.add(dependente.getNome());

        }
        return dependentesFuncionario;
    }

    public int calculaDiasParaAniversario(Dependente dependente){
        int mesAniversario = dependente.getDataDeNascimento().getMesData();
        int mesAtual = data.getMesData();
        if(mesAniversario > mesAtual){
            return (mesAniversario - mesAtual)*30;
        }
        if(mesAniversario < mesAtual){
            return ((12-mesAtual)+mesAniversario)*30;
        }
        else return 0;
    }


    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public TesteData getData() {
        return data;
    }

    public void setData(TesteData data) {
        this.data = data;
    }

    public void adicionaDependentes(Dependente dependente){
        dependentes.add(dependente);
    }
    public void removeDependentes(Dependente dependente){
        dependentes.remove(dependente);
    }
    public void adicionaOcorrencias(Ocorrencia ocorrencia){
        ocorrencias.add(ocorrencia);
    }
    public void removeOcorrencias(Ocorrencia ocorrencia){
        ocorrencias.remove(ocorrencia);
    }
}