/*
49. Escreva um programa que leia um número inteiro e determine se ele é 
positivo, negativo ou zero. 
*/

package com.mycompany.questao_49;

import java.util.Scanner;

public class Positivo_Negativo_Zero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        if(numero > 0){
            System.out.println("O número positivo.");
        }
        else if(numero < 0){
            System.out.println("O número negativo.");
        }
        else{
            System.out.println("O número zero.");
        }
    }
}
