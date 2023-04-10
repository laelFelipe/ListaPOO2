
/*
54.Escreva um programa que leia uma sequência de números e determine o maior e 
o menor número lido.
*/
package com.mycompany.questao_54;
import java.util.Scanner;

public class MaiorMenor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int numero;

        System.out.print("Digite um número ou 0 para sair: ");
        numero = sc.nextInt();

        while(numero != 0) {
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
            System.out.print("Digite um número ou 0 para sair: ");
            numero = sc.nextInt();
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
