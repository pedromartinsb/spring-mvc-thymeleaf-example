package com.curso.boot.domain;

public enum UF {
	
	AC("AC", "Acre"),
	AL("AL", "Alagoas"),
	AM("AM", "Amazonas"),
	BA("BA", "Bahia"),
	CE("CE", "Ceara"),
	DF("DF", "Distrito Federal"),
	ES("ES", "Espirito Santo"),
	GO("GO", "Goias"),
	MA("MA", "Maranhao"),
	MG("MG", "Minas Gerais"),
	MS("MS", "Mato Grosso do Sul"),
	MT("MT", "Mato Grosso"),
	PA("PA", "Para"),
	PB("PB", "Paraiba"),
	PE("PE", "Pernambuco"),
	PI("PI", "Piaui"),
	PR("PR", "Parana"),
	RJ("RJ", "Rio de Janeiro"),
	RN("RN", "Rio Grande do Norte"),
	RS("RS", "Rio Grando do Sul"),
	RO("RO", "Rondonia"),
	RR("RR", "Roraima"),
	SC("SC", "Santa Catarina"),
	SE("SE", "Sergipe"),
	SP("SP", "Sao Paulo"),
	TO("TO", "Tocantins");

	private String sigla;
	private String descricao;
	
	UF(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
}
