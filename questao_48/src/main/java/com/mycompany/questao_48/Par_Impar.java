/*
48.Escreva um programa que leia um número inteiro e determine se ele é par
ou ímpar.
*/

package com.mycompany.questao_48;

import java.util.Scanner;

public class Par_Impar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número é par.");
        }
        else{
            System.out.println("O número é ímpar.");
        }
    }
}
