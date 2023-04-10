/*
9.Escreva um programa que leia um número inteiro e imprima a sequência de 
Fibonacci até o número informado. Utilize um loop while e estruturas condicionais.
*/

package com.mycompany.questao_09;

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um num inteiro: ");
        int num = sc.nextInt();
        
        int i = 1;
        int j = 1;
        int temp;
        
        System.out.print("Sequência de Fibonacci até " + num + ": ");
        while(i <= num){
            System.out.print(i + " ");
            temp = j;
            j = i + j;
            i = temp;
        }
    }
}
