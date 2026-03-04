// Exercício 1.1 - Fazer um programa em Java que receba via teclado o Nome de um Aluno, e as três
// notas que ele tirou nas três avaliações de uma disciplina (Nota 1, a Nota 2 e a Nota 3). Em seguida
// programa deverá calcular e exibir a nota final do aluno na disciplina e média de notas por avaliação


import java.util.*;
public class Exercicio1_1 {

	public static void main(String[] args) {
		String nome;
		byte nota1;
		byte nota2;
		byte nota3;
		byte somaNota;
		float mediaNota;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do(a) aluno(a): ");
		nome = leia.nextLine();
		
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextByte();
		
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextByte();
		
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextByte();
		
		somaNota = (byte) (nota1 + nota2 + nota3);
		mediaNota = somaNota / 3;
		
		System.out.println("A soma das notas do(a) aluno(a) " + nome + " é " + somaNota + " e a média de suas notas é " + mediaNota);

		leia.close();
	}

}

// Código feito por: João Pedro do Espírito Santo Ribeiro