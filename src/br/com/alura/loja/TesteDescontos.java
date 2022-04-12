package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {

		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("100"), 1);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("200"), 20);
		Orcamento terceiroOrcamento = new Orcamento(new BigDecimal("3000"), 3);
		Orcamento quartoOrcamento = new Orcamento(new BigDecimal("4000"), 40);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		System.out.println(calculadora.calcular(primeiroOrcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));
		System.out.println(calculadora.calcular(terceiroOrcamento));
		System.out.println(calculadora.calcular(quartoOrcamento));
		
	}

}
