package com.sanvalero;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumerosRomanos {

    enum ValorLetrasRomanas {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        int valor;

        ValorLetrasRomanas(int valor) {
            this.valor = valor;
        }

        public static List<ValorLetrasRomanas> listaNumerosRomanos() {
            List<ValorLetrasRomanas> letras = Arrays.asList(ValorLetrasRomanas.values());
            Collections.reverse(letras);
            return letras;
        }

    }
    public String play(int numero) {

        StringBuilder resultado = new StringBuilder();

        int resto = numero;

        for (ValorLetrasRomanas letra : ValorLetrasRomanas.listaNumerosRomanos()) {
            while (resto >= letra.valor) {
                resultado.append(letra);
                resto -= letra.valor;
            }
        }

        return resultado.toString();
    }
}
