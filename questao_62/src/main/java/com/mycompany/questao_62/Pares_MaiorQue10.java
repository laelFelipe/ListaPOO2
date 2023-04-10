/*
62. Escreva um programa que leia uma sequência de números e determine 
quantos números são pares e maiores que 10.
*/

package com.mycompany.questao_62;

import java.util.Scanner;

public class Pares_MaiorQue10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contadorPares = 0, contadorMaioresQue10 = 0;

        System.out.print("Digite uma sequência de num separados por espaço: ");
        String sequencia = sc.nextLine();

        String[] numeros = sequencia.split(" ");

        for (String num : numeros){
            numero = Integer.parseInt(num);

            if (numero % 2 == 0){
                contadorPares++;
            }
            if (numero > 10){
                contadorMaioresQue10++;
            }
        }

        System.out.println("Qtd números pares: " + contadorPares);
        System.out.println("Qtd números maiores que 10: " + contadorMaioresQue10);
    }
}
