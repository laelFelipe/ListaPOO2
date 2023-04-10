/*
7. Crie uma classe Retangulo com atributos largura e altura. 
Adicione métodos para calcular a área e o perímetro do retângulo. 
Escreva um programa em Java que cria um objeto Retangulo, solicita ao usuário 
as dimensões do retângulo e imprime a área e o perímetro.
*/

package com.mycompany.questao_07;

public class Retangulo{
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return 2 * (this.largura + this.altura);
    }
}

