// Exercicio 1.2 - Fazer um programa em Java que receba via teclado o Nome e o Salário de um
// empregado. Em seguida o programa deverá calcular e exibir o Novo Salário do empregado considerando
// que ele recebeu um aumento de 15%

import java.util.*;

public class Exercicio1_2 {
	public static void main(String[] args) {
		String nome;
		float salario;
		float aumento;
		float novoSal;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o nome do funcionário: ");
		nome = leia.nextLine();

		System.out.print("Digite o salário do funcionário: ");
		salario = leia.nextFloat();

		aumento = salario * 15 / 100;
		novoSal = salario + aumento;

		System.out.print("O novo salário de " + nome + " é " + novoSal);

		leia.close();
		
	}
}

// Código feito por: João Pedro do Espírito Santo Ribeiro