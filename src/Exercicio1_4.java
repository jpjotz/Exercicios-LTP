// Exercicio 1.4 - Faça um programa em Java que receba via teclado a distância em km e o tempo em
// horas de um veículo. Calcule e imprima a velocidade deste veículo em km/h.

import java.util.*;
public class Exercicio1_4 {
	public static void main(String[] args) {
		float distancia;
		float tempo;
		float velocidade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a distância: ");
		distancia = leia.nextFloat();
		
		System.out.print("Digite o tempo: ");
		tempo = leia.nextFloat();
		
		velocidade = distancia/tempo;
		
		System.out.println("A velocidade do carro é: " + velocidade + "Km/h");

		leia.close();
		
	}
}

// código feito por: João Pedro do Espírito Santo Ribeiro