/*
8.Escreva um programa em Java que recebe dois números inteiros do usuário 
e imprime todos os números primos no intervalo entre eles. 
*/

package com.mycompany.questao_08;

import java.util.Scanner;

public class NumerosPrimos{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite o primeiro número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = sc.nextInt();
        
        for(int i = num1; i <= num2; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
