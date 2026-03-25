// Exercício 4.4 - Em uma Fábrica trabalham empregados divididos em 3 classes: A, B e C. Fazer um
// programa em Java que receba via teclado o CÓDIGO DO OPERÁRIO (inteiro), a CLASSE do operário
// (caracter 1 posição) e o NÚMERO DE PEÇAS FABRICADAS no mês (inteiro). Em seguida o programa
// deverá calcular e imprimir o salário dos empregados considerando a tabela a seguir:
// CLASSE Peças fabricadas no mês Calculo do Salário
// A até 30 R$500,00 + R$2,00 por peça fabricada
// A de 31 a 40 R$500,00 + R$2,30 por peça fabricada
// A acima de 40 R$500,00 + R$2,80 por peça fabricada
// B - R$1.200,00
// C Até 50 R$ 40,00 por peça fabricada
// C acima de 50 R$ 45,00 por peça fabricada
// Ao final, o programa deverá imprimir:
// - Total gasto pela empresa com o pagamento de salários
// - Número total de peças fabricadas
// - Código do Operário que fabricou o menor número de peças
// - Média de quantidade de peças fabricadas por empregados da classe B
// Obs:
// - adotar o flag Código de Operário = 0 (zero) para encerrar a entrada de dados;
// - consistir os seguintes valores digitados na entrada de dados:
// - NÚMERO DE PEÇAS deverá ser maior que zero
// - CLASSE deverá ser A, B ou C

import java.util.*;

public class Exercicio4_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigoOperario;
        char classeOperario;
        int numeroPecasFabricadas;
        float salario;
        float totalGastoEmpresa = 0;
        int totalPecasFabricadas = 0;
        int menorNumeroPecas = Integer.MAX_VALUE;
        int totalOperariosB = 0;
        int pecasFabricadasB = 0;
        float mediaFabricadosB = 0;
        int codigoMenorPecas = 0;

        while (true) {

            System.out.print("Digite o código do operário: ");
            codigoOperario = leia.nextInt();

            if (codigoOperario == 0) {
                break;
            }

            do {
                System.out.print("Digite a classe do operário (A, B ou C): ");
                classeOperario = leia.next().charAt(0);

                if (classeOperario != 'A' && classeOperario != 'B' && classeOperario != 'C') {
                    System.out.println("Digite uma classe válida!");
                }

            } while (classeOperario != 'A' && classeOperario != 'B' && classeOperario != 'C');

            do {
                System.out.print("Digite o número de peças fabricadas: ");
                numeroPecasFabricadas = leia.nextInt();

                if (numeroPecasFabricadas <= 0) {
                    System.out.println("Digite um valor válido para o número de peças fabricadas!");
                }

            } while (numeroPecasFabricadas <= 0);

            if (classeOperario == 'A') {
                if (numeroPecasFabricadas <= 30) {
                    salario = 500 + (2 * numeroPecasFabricadas);
                } else if (numeroPecasFabricadas >= 31 && numeroPecasFabricadas <= 40) {
                    salario = (float) (500 + (2.30 * numeroPecasFabricadas));
                } else {
                    salario = (float) (500 + 2.80 * numeroPecasFabricadas);
                }
            } else if (classeOperario == 'B') {
                totalOperariosB++;
                pecasFabricadasB += numeroPecasFabricadas;
                salario = 1200;
            } else {
                if (numeroPecasFabricadas <= 50) {
                    salario = 40 * numeroPecasFabricadas;
                } else {
                    salario = 45 * numeroPecasFabricadas;
                }
            }

            if (numeroPecasFabricadas < menorNumeroPecas) {
                menorNumeroPecas = numeroPecasFabricadas;
                codigoMenorPecas = codigoOperario;
            }

            totalGastoEmpresa += salario;
            totalPecasFabricadas += numeroPecasFabricadas;
            mediaFabricadosB = totalOperariosB > 0 ? (float) pecasFabricadasB / totalOperariosB : 0;
        }

        System.out.printf("Total gasto pela empresa com pagamento de salários: R$ %.2f \n", totalGastoEmpresa);
        System.out.printf("Total de peças fabricadas: %d \n", totalPecasFabricadas);
        System.out.printf("Código do operário que fabricou o menor número de peças: %d \n", codigoMenorPecas);
        System.out.printf("Média de peças fabricadas pelos empregados da classe B: %.2f \n", mediaFabricadosB);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro