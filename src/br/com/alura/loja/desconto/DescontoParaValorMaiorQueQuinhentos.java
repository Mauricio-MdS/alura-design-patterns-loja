package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaValorMaiorQueQuinhentos extends Desconto {

	public DescontoParaValorMaiorQueQuinhentos(Desconto desconto) {
		super(desconto);
	}
	
	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(orcamento);
	}

}
