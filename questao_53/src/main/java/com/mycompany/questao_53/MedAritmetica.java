/*
53. Escreva um programa que leia uma sequência de números e determine a média aritmética deles.
*/
package com.mycompany.questao_53;

import java.util.Scanner;

public class MedAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        int num;

        System.out.print("Digite um número ou 0 para sair: ");
        num = sc.nextInt();

        while(num != 0){
            soma += num;
            contador++;

            System.out.print("Digite um número ou 0 para sair: ");
            num = sc.nextInt();
        }
        if(contador == 0){
            System.out.println("nenhum número digitado.");
        }
        else{
            double media = (double) soma / contador;
            System.out.println("A média aritmética é: " + media);
        }
    }
}
