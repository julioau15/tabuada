package br.senai.sp.jandira.tabuada.model;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Tabuada {

    public String[] calcularTabuada(String multiplicadorInicial, String multiplicadorFinal, String multiplicando) {
        String[] tabuada;
        int apoio = 0;
        int multiIni = Integer.parseInt(multiplicadorInicial);
        int multiFinal = Integer.parseInt(multiplicadorFinal);
        int multi = Integer.parseInt(multiplicando);

        if (multiFinal < multiIni) {
            apoio = multiFinal;
            multiFinal = multiIni;
            multiIni = apoio;
        }

        int tamanho = multiFinal - multiIni + 1;
        tabuada = new String[tamanho];

        int i = 0;

        while (i < tamanho) {
            int produto = multi * multiIni;
            tabuada[i] = multi + " x " + multiIni + " = " + produto;
            i = i + 1;
            multiIni ++;
        }

        return tabuada;
    }

}

