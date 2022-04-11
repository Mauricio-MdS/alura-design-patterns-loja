package br.com.alura.loja.imposto;

import java.math.BigDecimal;

public enum TipoDeImposto {
	
	ICMS {
		@Override
		public BigDecimal aliquota() {
			return new BigDecimal("0.1");
		}
	},
	ISS {
		@Override
		public BigDecimal aliquota() {
			return new BigDecimal("0.06");
		}
	};
	
	public abstract BigDecimal aliquota();

}
