package com.bcopstein;

public interface Formatador {

	// Formata uma palavra da lingua inglesa
	// A palavra recebida so pode conter letras ou dígitos
	// Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
	// Se a palavra estiver vazia tambem retorna a excecao
	// Retorna a palavra em maiusculas 
	String formataPalavra(String palavra);

	// Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
	String formataPalavraPlus(String palavra);

	// Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
	// Frases vazias geram IllegalArgumentException
	// As palavras da frase devem ser convertidas pelo metodo formataPalavra
	// Qualquer outro simbolo gera IllegalArgumentException
	String formataFrase(String frase);

}