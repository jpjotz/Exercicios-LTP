// Exercício 2.3 – Faça um programa em Java que receba via teclado o nome e o salário de um empregado
// da empresa ABC. O algoritmo deverá calcular e imprimir o novo salário para o funcionário de acordo
// com a tabela abaixo:
// - Salário abaixo de R$1.000,00 – aumento de 15%
// - Salário de R$1.000,00 para cima – aumento de 10%


import java.util.*;
public class Exercicio2_3 {
    public static void main(String[] args) {
        String nome;
        float salario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do empregado: ");
        nome = leia.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        salario = leia.nextFloat();

        if (salario < 1000) {
            salario += (salario * 15/100);
        } else {
            salario += (salario * 10/100);
        }

        System.out.printf("O novo sálario de %s é de %.2f reais", nome, salario);

    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro