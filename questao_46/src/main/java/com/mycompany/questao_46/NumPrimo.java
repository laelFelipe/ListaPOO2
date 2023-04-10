/*
46.Escreva um programa que leia um número inteiro e verifique se ele é um número
primo 
*/

package com.mycompany.questao_46;

import java.util.Scanner;

public class NumPrimo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        boolean ehPrimo = true;

        if(numero <= 1){
            ehPrimo = false;
        } 
        else{
            for(int i = 2; i <= numero / 2; i++){
                if(numero % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
        }
        if(ehPrimo){
            System.out.println("O número " + numero + " é primo.");
        }
        else{
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}
