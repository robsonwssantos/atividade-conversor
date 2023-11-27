package org.example;

import java.util.Map;

public class Conversor {
    // Constante com todos valores inteiros possiveis equivalentes aos numeros romanos
    private final static int[] NUMEROS_REAIS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    // Constante Array de possiveis numeros romanos e combinações de subtração como IV, IX
    private final static String[] NUMEROS_ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public String converterNumeroReal (int numero) {
        StringBuilder resultado = new StringBuilder();

        //Usando a classe StringBuilder para fazer concatenação de uma string de uma forma mais performatica

        if(numero > 0) {
            for (int i = 0; i < NUMEROS_REAIS.length; i++){
                while (numero >= NUMEROS_REAIS[i]) {
                    resultado.append(NUMEROS_ROMANOS[i]);
                    numero = numero - NUMEROS_REAIS[i];
                }
            }
        }
        return resultado.toString();
    };

    public  int converterNumeroRomano(String numeroRomano) {
        int resultado = 0;
        int i = 0;

        while (i < numeroRomano.length()) {

            int numeroReal = resgatarNumeroPelaLetra(numeroRomano.charAt(i));
            int numeroReal2 = 0;

            if (i + 1 < numeroRomano.length()) {
                numeroReal2 = resgatarNumeroPelaLetra(numeroRomano.charAt(i + 1));
            }
            if(numeroReal < numeroReal2){
                resultado = resultado + (numeroReal2 - numeroReal);
                i++;
            }else {
                resultado = resultado + numeroReal;
            }
            i++;
        }

        return  resultado;
    }

    private int resgatarNumeroPelaLetra(char letra){
        Map<Character, Integer> mapa = Map.of(
                'M', 1000,
                'D', 500,
                'C', 100,
                'L', 50,
                'X', 10,
                'V', 5,
                'I', 1
        );
        return mapa.get(letra);
    }

}