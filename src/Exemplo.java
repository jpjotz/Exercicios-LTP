import java.util.*;

public class Exemplo {

	public static void main(String[] args) {
		// 1- Declaração de Variáveis

		float salario;
		float valorAumento;
		float novoSal;
		Scanner leia = new Scanner(System.in);

		// 2- Entrada de dados

		System.out.print("Digite o salário: ");
		salario = leia.nextFloat();

		System.out.print("Digite o valor do aumento: ");
		valorAumento = leia.nextFloat();

		// cálculo
		novoSal = salario + valorAumento;

		// Saída de dados
		System.out.println("O novo salário é: " + novoSal);

	}

}
