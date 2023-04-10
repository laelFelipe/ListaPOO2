/*
50. Escreva um programa que leia um número inteiro e determine se ele é um 
número perfeito, ou seja, se é igual à soma de seus divisores próprios. 
*/

package com.mycompany.questao_50;

import java.util.Scanner;

public class Num_Perfeito{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, somaDivisores = 0;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        for (int i = 1; i < numero; i++){
            if(numero % i == 0){
                somaDivisores += i;
            }
        }
        if(somaDivisores == numero){
            System.out.println("O número " + numero + " é um num perfeito.");
        }
        else{
            System.out.println("O número " + numero + " não é um num perfeito.");
        }
    }
}
