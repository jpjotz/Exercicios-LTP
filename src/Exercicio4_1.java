// Exercício 4.1- Fazer um programa em Java para receber via teclado o NOME, o SALÁRIO e o NÚMERO
// DE DEPENDENTES dos 10 empregados de uma empresa. O programa deverá calcular um Novo Salário
// para cada empregado de acordo com a tabela abaixo:
// - salários abaixo de R$1.000,00 terão aumento de 30%
// - salários de R$1.000,00 até R$2.000,00 terão aumento de 20%
// - salários acima de R$2.000,00 terão aumento de 10%
// Em seguida, o programa deverá acrescentar ao Novo Salário calculado R$50,00 por DEPENDENTE e
// imprimir o Novo Salário.
// Ao final o programa deverá imprimir:
// - Soma dos Novos Salários
// - Média dos Novos Salários
// - Número de empregados que passou a receber salário acima de R$1700,00.

import java.util.*;

public class Exercicio4_1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String nome;
        float salario;
        float novoSalario;
        int numeroDependentes;
        float somaNovosSalarios = 0;
        float mediaNovosSalarios = 0;
        int somaEmpregadosSalario1700 = 0;

        for (int x = 1; x <= 10; x++) {
            
            System.out.print("Digite o nome do funcionário: ");
            nome = leia.nextLine();

            System.out.print("Digite o salário do funcionário: ");
            salario = leia.nextFloat();

            System.out.print("Digite o número de dependentes: ");
            numeroDependentes = leia.nextInt();

            leia.nextLine();

            if (salario < 1000) {
                salario += (salario * 30 / 100);
                novoSalario = salario + 50 * numeroDependentes;

            } else if (salario >= 1000 && salario < 2000) {
                salario += (salario * 20 / 100);
                novoSalario = salario + 50 * numeroDependentes;

            } else {
                salario += (salario * 10 / 100);
                novoSalario = salario + 50 * numeroDependentes;

            }
            System.out.printf("O novo salário é de: %.2f \n", novoSalario);

            somaNovosSalarios += novoSalario;

            if (novoSalario > 1700) {
                somaEmpregadosSalario1700++;
            }

        }

        mediaNovosSalarios = somaNovosSalarios / 10;

        System.out.printf("Soma dos novos salários: %.2f", somaNovosSalarios);
        System.out.printf("\nMedia dos novos salários: %.2f", mediaNovosSalarios);
        System.out.printf("\nNúmero de empregados que vão receber mais do que R$ 1700: %d", somaEmpregadosSalario1700);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro