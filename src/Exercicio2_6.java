// Exercício 2.6 – Fazer um programa em Java que receba via teclado as medidas dos 3 lados de um
// triângulo. De acordo com os valores digitados o programa deverá imprimir o tipo do triângulo:
// - não é triangulo, se a soma de dois lados for menor ou igual ao terceiro lado;
// - equilátero, se os 3 lados forem iguais;
// - isósceles, se 2 lados forem iguais e 1 diferente;
// - escaleno, se os 3 lados forem diferentes;

import java.util.*;
public class Exercicio2_6 {
    public static void main(String[] args) {
        float lado1;
        float lado2;
        float lado3;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        lado1 = leia.nextFloat();

        System.out.print("Digite o segundo lado do triângulo: ");
        lado2 = leia.nextFloat();

        System.out.print("Digite o terceiro lado do triângulo: ");
        lado3 = leia.nextFloat();

        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("Não é triângulo!");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero!");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isósceles!");
        } else {
            System.out.println("O triângulo é escaleno!");
        }
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro