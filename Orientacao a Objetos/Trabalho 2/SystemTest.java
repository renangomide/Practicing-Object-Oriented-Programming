package org.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SystemTest {
    @Test void testeCalcularSalarioLiquido(){
        int valorBonus = 150;
        int valorOnus = 100;
        Cargo cargo = new Cargo(1000);
        TesteData data = new TesteData(new Date());
        Dependente dependente = new Dependente(data);
        Funcionario funcionario = new Funcionario("joao",cargo,data);
        Ocorrencia ocorrencia = new Ocorrencia(valorBonus,valorOnus,"Bonus");
        funcionario.adicionaDependentes(dependente);
        funcionario.adicionaOcorrencias(ocorrencia);
        int salario = funcionario.calcularSalarioLiquido(data.getAnoData(), data.getMesData());
        assertEquals(1250,salario);

    }

}