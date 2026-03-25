// Exercício 4.3 – Fazer um programa em Java para receber via teclado a ALTURA em metros e o SEXO
// dos atletas de uma delegação. O programa deverá calcular e imprimir:
// - a maior altura encontrada
// - a menor altura encontrada
// - o número de atletas do sexo feminino
// - a média da altura masculina
// - a média geral das alturas.
// Obs:
// - adotar um flag para encerrar a entrada de dados;
// - consistir os valores digitados na entrada de dados de maneira que só poderão ser aceitos:
// SEXO = M ou F;
// ALTURA maior que zero e menor ou igual a 2,5 metros;

import java.util.*;

public class Exercicio4_3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float maiorAltura = Float.MIN_VALUE;
        float menorAltura = Float.MAX_VALUE;
        int atletasFemininas = 0;
        float alturaMasculina = 0;
        float alturasTotais = 0;
        int atletaMasculino = 0;
        int totalAtletas = 0;
        float mediaAlturaMasculina;
        float mediaGeral;
        char sexo;
        float altura;

        while (true) {
            do {
                System.out.print("Digite a altura do atleta (999 para sair): ");
                altura = leia.nextFloat();
            } while (altura < 0 || altura > 2.5);

            do {
                System.out.print("Digite o sexo do atleta (X para sair): ");
                sexo = leia.next().charAt(0);
            } while (sexo != 'F' && sexo != 'M' && sexo != 'X');

            if (sexo == 'X' || altura == 999) {
                break;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'F') {
                atletasFemininas++;
                totalAtletas++;
                alturasTotais += altura;
            }

            if (sexo == 'M') {
                alturasTotais += altura;
                totalAtletas++;
                atletaMasculino++;
                alturaMasculina += altura;
            }
        }

        mediaAlturaMasculina = atletaMasculino > 0 ? alturaMasculina / atletaMasculino : 0;
        mediaGeral = totalAtletas > 0 ? alturasTotais / totalAtletas : 0;

        System.out.printf("Maior altura encontrada: %.2f \n", maiorAltura);
        System.out.printf("Menor altura encontrada: %.2f \n", menorAltura);
        System.out.printf("Total de atletas femininas: %d \n", atletasFemininas);
        System.out.printf("Média das alturas masculinas: %.2f \n", mediaAlturaMasculina);
        System.out.printf("Média geral das alturas: %.2f \n", mediaGeral);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro