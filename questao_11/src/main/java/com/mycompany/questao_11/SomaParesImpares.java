/*
11.Escreva um programa que leia uma sequência de números inteiros e imprima
a soma dos números pares e a soma dos números ímpares. Utilize um loop for e 
estruturas condicionais. 
*/
package com.mycompany.questao_11;

import java.util.Scanner;

public class SomaParesImpares{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;

        System.out.print("Digite uma sequência de números inteiros separados por espaço: ");
        String[] numerosStr = sc.nextLine().split(" ");

        for (String numeroStr : numerosStr){
            int numero = Integer.parseInt(numeroStr);
            if(numero % 2 == 0){
                somaPares += numero;
            }
            else{
                somaImpares += numero;
            }
        }
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números ímpares é: " + somaImpares);

        sc.close();
    }
}
