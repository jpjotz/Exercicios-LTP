// Exercicio 1.3 - Fazer um programa em Java que receba via teclado o Valor em dinheiro a ser colocado
// em uma aplicação financeira e o valor da Taxa de Juros a ser aplicada. Em seguida o programa deverá
// calcular e exibir o Valor recebido como rendimento da aplicação e o Valor total após o rendimento.

import java.util.*;

public class Exercicio1_3 {
	public static void main(String[] args) {
		float valor;
		float taxaJuros;
		float valorRecebido;
		float valorTotal;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o valor: ");
		valor = leia.nextFloat();

		System.out.print("Digite o valor da taxa de juros: ");
		taxaJuros = leia.nextFloat();

		taxaJuros /= 100;
		valorRecebido = (valor * taxaJuros);
		valorTotal = valor + valorRecebido;

		System.out.println("O valor recebido foi " + valorRecebido + " e o valor total é " + valorTotal);

		leia.close();
	}
}

// código feito por: João Pedro do Espírito Santo Ribeiro