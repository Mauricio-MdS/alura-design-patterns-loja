package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaMaisDeCincoItens extends Desconto {

	public DescontoParaMaisDeCincoItens(Desconto desconto) {
		super(desconto);
	}
	
	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}

}
