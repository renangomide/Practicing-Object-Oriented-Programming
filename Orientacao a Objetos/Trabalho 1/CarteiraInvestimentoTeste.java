package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CarteiraInvestimentoTest {

    @Test
    void verificaCarteiraInvestimento() {
        CarteiraInvestimento carteiraInvestimento = new CarteiraInvestimento(1234567, 100000);
        double expectedNumcarteira = 1234567;
        double expectedSaldo = 100000;
        assertEquals(expectedNumcarteira, carteiraInvestimento.getNumCarteira());
        assertEquals(expectedSaldo, carteiraInvestimento.getSaldo());
    }

    @Test
    void verificaBolsaValores() {
        BolsaValores bolsaValores = new BolsaValores(1234567, 100000);
        bolsaValores.investir(5000);
        bolsaValores.retirar(104950);
        double expectedSaldoAposMovimentacao = 0;
        assertEquals(expectedSaldoAposMovimentacao, bolsaValores.getSaldo());
    }

    @Test
    void verificaInvestimento() {
        Investimento investimento = new Investimento(1234567, 100000);
        investimento.investir(5000);
        investimento.retirar(103960.396);
        double expectedSaldoAposMovimentacao = 0;
        assertEquals(expectedSaldoAposMovimentacao, investimento.getSaldo(),0.0001);
    }
}