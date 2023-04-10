
/*
7. Crie uma classe Retangulo com atributos largura e altura. 
Adicione métodos para calcular a área e o perímetro do retângulo. 
Escreva um programa em Java que cria um objeto Retangulo, solicita ao usuário 
as dimensões do retângulo e imprime a área e o perímetro.
*/

package com.mycompany.questao_07;

import java.util.Scanner;

public class Questao_07{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
