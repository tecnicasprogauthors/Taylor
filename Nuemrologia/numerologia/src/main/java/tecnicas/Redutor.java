package com.bcopstein;

public interface Redutor {

	// Define o tipo de tabela da tabela corrente
	void setTipoTabela(TipoTabela tipo);

	// Calcula a reducao de palavra usando a tabela corrente
	int reducaoPalavra(String palavra);

	// Calcula a reducao de frase usando a tabela corrente
	int reducaoFrase(String frase);

	// Calcula a reducao de uma data no formato dd/mm/aaaa
	// Se estiver fora do formato lanca IllegalArgumentException
	int reducaoData(String data);

}