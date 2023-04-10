
package lista;

/*
7. Crie uma classe Retangulo com atributos largura e altura. 
Adicione métodos para calcular a área e o perímetro do retângulo. 
Escreva um programa em Java que cria um objeto Retangulo, solicita ao usuário 
as dimensões do retângulo e imprime a área e o perímetro.
*/

import java.util.Scanner;

public class Questao_07 {
    public static void main(String[] args) {
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

public class Retangulo{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}

