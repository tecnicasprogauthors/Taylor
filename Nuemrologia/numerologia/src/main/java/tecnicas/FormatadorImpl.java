package com.bcopstein;

import java.util.regex.Pattern;

public class FormatadorImpl implements Formatador{
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou dígitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    /* (non-Javadoc)
	 * @see com.bcopstein.Formatador#formataPalavra(java.lang.String)
	 */
    @Override
	public String formataPalavra(String palavra){
		String newPal = palavra.toUpperCase();
        if (Pattern.matches("[A-Z0-9]+", newPal)){
            return newPal;
        }else{
            throw new IllegalArgumentException("Caracter invalido: ["+newPal+"]");
        }
    }

    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    /* (non-Javadoc)
	 * @see com.bcopstein.Formatador#formataPalavraPlus(java.lang.String)
	 */
    @Override
	public String formataPalavraPlus(String palavra) {

        palavra = formataPalavra(palavra+"");

        char[] letras = palavra.toCharArray();
        char primeira = letras[0];

        if (primeira >= 'A' && primeira <= 'Z') return palavra;
        else throw new IllegalArgumentException("Palavra deve comecar com uma letra: [" + palavra + "]");

    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    /* (non-Javadoc)
	 * @see com.bcopstein.Formatador#formataFrase(java.lang.String)
	 */
    @Override
	public String formataFrase(String frase){
        String regex = "[\\p{Punct}\\p{Blank}]+";
        String[] palavras = frase.split(regex);
        String fraseF = "";
        for(int i=0;i<palavras.length;i++){
            fraseF += formataPalavra(palavras[i])+" ";
        }
        return fraseF.substring(0,fraseF.length()-1);
    }
}
