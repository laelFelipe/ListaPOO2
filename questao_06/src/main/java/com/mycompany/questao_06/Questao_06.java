/*
6. Escreva um programa em Java que recebe uma sequência de números do usuário e
imprime o número que mais se repete.
*/
package com.mycompany.questao_06;

import java.util.*;

public class Questao_06{
    
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // lê a sequência de números do usuário
        System.out.print("Digite uma sequência de números separados por espaço: ");
        String[] numeros = scanner.nextLine().split(" ");

        // cria um mapa para contar a frequência de cada número
        Map<Integer, Integer> frequencia = new HashMap<>();
        for (String numero : numeros){
            int valor = Integer.parseInt(numero);
            if(frequencia.containsKey(valor)){
                frequencia.put(valor, frequencia.get(valor) + 1);
            }
            else{
                frequencia.put(valor, 1);
            }
        }

        // encontra o número mais repetido
        int maisRepetido = 0;
        int maxFrequencia = 0;
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int numero = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFrequencia){
                maisRepetido = numero;
                maxFrequencia = freq;
            }
        }
        // imprime o resultado
        System.out.println("O número que mais se repete é: " + maisRepetido);
    }
}
