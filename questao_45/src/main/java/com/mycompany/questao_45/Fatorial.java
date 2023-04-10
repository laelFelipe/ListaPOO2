/*
45.Escreva um programa que leia um número inteiro e determine o seu fatorial.
Utilize a classe BigInteger do Java para lidar com números muito grandes. 
*/
package com.mycompany.questao_45;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        BigInteger fatorial = BigInteger.valueOf(1);

        for(int i = 2; i <= n; i++){
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + fatorial + "  -- ");
        sc.close();
    }
}

