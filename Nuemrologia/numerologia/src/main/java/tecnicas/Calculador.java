package com.bcopstein;

// Ver os algoritmos de calculo na wiki do projeto
// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
    private Formatador formatador;
    private Redutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(Redutor reducao, Formatador formatador){
        this.reducao = reducao;
        this.formatador = formatador;
    }

    public int calculaNumeroDaVida(String data){
        int numero = reducao.reducaoData(data);
        return numero;
    }

    public int calculaNumeroDestino(String nomeCompleto){
        String nomeFormatado = formatador.formataFrase(nomeCompleto);
        int numero = reducao.reducaoFrase(nomeFormatado);
        return numero;
    }

    public int calculaNumeroDesejosDaAlma(String nomeCompleto){
        return 0;
    }
}