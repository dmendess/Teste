package br.com.calc.enums;

public enum OperacoesEnum {
	
	SOMA (1,"Soma"),
	SUBTRACAO (2,"Subratração"),
	MULTIPLICACAO (3,"Multiplicação"),
	DIVISAO (4,"Divisão");
	
	private Integer codigoOperacao;
	private String nomeOperacao;
	
	OperacoesEnum(Integer codigoOperacao, String nomeOperacao) {
		this.codigoOperacao = codigoOperacao;
		this.nomeOperacao = nomeOperacao;
	}
	
	public Integer getCodigoOperacao() {
		return codigoOperacao;
	}
	public void setCodigoOperacao(Integer codigoOperacao) {
		this.codigoOperacao = codigoOperacao;
	}
	public String getNomeOperacao() {
		return nomeOperacao;
	}
	public void setNomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}

	

}
