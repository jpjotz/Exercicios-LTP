// Exercício 1.5 – Considerando que:
// 1 pé = 12 polegadas;
// 1 polegada = 2,54 centímetros;
// 1 jarda = 3 pés;
// 1 milha = 1,760 jarda
// Faça um programa em Java que receba via teclado a digitação de uma medida em pés, em seguida,
// faça as conversões e exiba o valor em polegadas, centímetros, jardas e milhas.

import java.util.*;
public class Exercicio1_5 {
    public static void main(String[] args) {
        float pe;
        float polegada;
        float jarda;
        float milha;
        float centimetros;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a medida em pés: ");
        pe = leia.nextFloat();

        polegada = pe * 12;
        centimetros = polegada * 2.54f;
        jarda = pe / 3;
        milha = jarda / 1760;

        System.out.printf("O valor de %.2f pés equivale a: %.2f polegadas, %.2f centímetros, %.2f jardas e %.5f milhas.", pe, polegada, centimetros, jarda, milha);

        leia.close();
    }
}

// código feito por: João Pedro do Espírito Santo Ribeiro
