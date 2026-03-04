// Exercício 2.8 – Faça um programa em Java para calcular e imprimir o Bônus Salarial e Desconto de
// Vale Transporte para um empregado da Empresa ABCDário LTDA. O programa deverá receber via
// teclado o Tempo de Casa e o Salário do Empregado e considerar:
// Tempo de Casa Salário Bônus Vale Transporte
// Até 5 anos Até R$300,00 R$50,00 5% do Salário
// Até 5 anos Acima de R$300,00 R$80,00 6% do Salário
// De 6 a 10 anos Até R$500,00 15% do Salário R$70,00
// De 6 a 10 anos Acima de R$500,00 até R$2000,00 13% do Salário R$90,00
// De 6 a 10 anos Acima de R$2000,00 12% do Salário 8% do Salário
// Acima de 10 anos ------------ R$300,00 4% do Salário

import java.util.*;

public class Exercicio2_8 {
    public static void main(String[] args) {

        int tempoDeCasa;
        double salario;
        double bonus = 0;
        double vale = 0;

        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o tempo de casa do empregado: ");
        tempoDeCasa = leia.nextInt();

        System.out.print("Digite o salário do empregado: ");
        salario = leia.nextDouble();

        if (tempoDeCasa <= 5 && salario <= 300) {
            bonus = 50;
            vale = salario * 0.05;

        } else if (tempoDeCasa <= 5 && salario > 300) {
            bonus = 80;
            vale = salario * 0.06;

        } else if (tempoDeCasa <= 10 && salario <= 500) {
            bonus = salario * 0.15;
            vale = 70;

        } else if (tempoDeCasa <= 10 && salario <= 2000) {
            bonus = salario * 0.13;
            vale = 90;

        } else if (tempoDeCasa <= 10) {
            bonus = salario * 0.12;
            vale = salario * 0.08;

        } else {
            bonus = 300;
            vale = salario * 0.04;
        }

        System.out.printf("Bônus: R$ %.2f\n", bonus);
        System.out.printf("Desconto Vale Transporte: R$ %.2f\n", vale);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro