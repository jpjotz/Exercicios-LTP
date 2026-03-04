// Exercicio 1.6 – Um empregado depositou todo o salário recebido no mês em uma conta bancária. O
// empregado emitiu dois cheques. O banco cobra uma taxa de 0,02 % do valor do cheque para cada
// cheque emitido. Considerando que antes do depósito o saldo na conta era zero, faça um programa em
// Java que receba via teclado a digitação do valor Depositado e os valores dos dois Cheques emitidos.
// Em seguida o programa deverá calcular e exibir o saldo final na conta bancária após a compensação
// dos cheques e das taxas por cheque.

import java.util.*;

public class Exercicio1_6 {
    public static void main(String[] args) {
        float valorDepositado;
        float valorCheque1;
        float valorCheque2;
        double taxa = 0.02/100;
        float saldoFinal;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor depositado: ");
        valorDepositado = leia.nextFloat();

        System.out.print("Digite o valor do primeiro cheque: ");
        valorCheque1 = leia.nextFloat();

        System.out.print("Digite o valor do segundo cheque: ");
        valorCheque2 = leia.nextFloat();

        valorCheque1 += taxa * valorCheque1;
        valorCheque2 += taxa * valorCheque2;

        saldoFinal = valorDepositado - valorCheque1 - valorCheque2;

        System.out.printf("O saldo final na conta é: %.2f", saldoFinal);

        leia.close();
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro