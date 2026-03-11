// Exercício 3.2 - Considerando que o fatorial de um número é o resultado da multiplicação entre si dos
// algarismos a partir de 1 até o respectivo número. Ex: fatorial de 5 = 5 x 4 x 3 x 2 x 1. Fazer um programa
// em Java que receba a digitação de um número inteiro, calcule e exiba na tela o fatorial deste um número. 

import java.util.*;

public class Exercicio3_2 {
    public static void main(String[] args) {
        int numero;
        long fatorial = 1;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para ver seu fatorial: ");
        numero = leia.nextInt();

        while (numero >= 1) {
            System.out.print(numero);

            fatorial = fatorial * numero;
            numero--;

            if (numero >= 1) {
                System.out.print(" x ");
            }
        }

        System.out.println("\nResultado: " + fatorial);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro