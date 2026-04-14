// Exercício 5.5 - Faça um programa em Java que receba via teclado o Nome, Nota e Sexo dos alunos
// da disciplina Linguagem e Técnicas de Programação. O programa deverá imprimir se o aluno está
// APROVADO ou REPROVADO, sabendo que a nota mínima para aprovação é 60.
// Como resultados finais o programa deverá imprimir:
// - o número de aprovações do sexo masculino;
// - o número de reprovações do sexo feminino;
// - a média das notas femininas;
// - a média geral das notas;
// - relatório somente dos alunos aprovados contendo o Nome e a Nota.
// Consistências: - aceitar somente notas inteiras entre 0 e 100;
// - aceitar somente os valores M ou F para sexo;
// Observações: - a turma tem 50 alunos;
// - você vai precisar criar um vetor para armazenar o nome dos aprovados e outro
// para armazenar a nota dos aprovados para imprimir o relatório no final.

import java.util.*;

public class Exercicio5_5 {
    public static void main(String[] args) {
        String nome;
        int nota;
        char sexo;
        Scanner leia = new Scanner(System.in);
        String[] nomesAprovados = new String[50];
        int[] notasAprovados = new int[50];
        int aprovadosMasc = 0;
        int reprovadasFem = 0;
        float mediaNotasFem;
        float mediaGeral;
        int totalNotas = 0;
        int notasFemininas = 0;
        int totalFemininas = 0;
        int j = 0; // Índice dos aprovados (Se utilizar i para registrar os alunos aprovados,
                   // ficariam buracos no vetor)

        for (int i = 0; i < 50; i++) {
            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            nome = leia.nextLine();

            do {
                System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 100): ");
                nota = leia.nextInt();

                if (nota < 0 || nota > 100) {
                    System.out.println("Digite uma nota maior que 0 ou menor que 100!");
                }

            } while (nota < 0 || nota > 100);

            do {
                System.out.print("Digite o sexo do aluno " + (i + 1) + " (F ou M): ");
                sexo = leia.next().charAt(0);

                if (sexo != 'F' && sexo != 'M') {
                    System.out.println("Digite um sexo válido!");
                }

            } while (sexo != 'F' && sexo != 'M');

            leia.nextLine();

            if (nota >= 60) {
                System.out.print("Aluno aprovado!");
                nomesAprovados[j] = nome;
                notasAprovados[j] = nota;
                j++;

                if (sexo == 'M') {
                    aprovadosMasc++;
                }
            } else {
                System.out.println("Aluno reprovado!");
                if (sexo == 'F') {
                    reprovadasFem++;
                }
            }

            if (sexo == 'F') {
                totalFemininas++;
                notasFemininas += nota;
            }

            totalNotas += nota;
        }

        mediaNotasFem = (float) notasFemininas / totalFemininas;
        mediaGeral = (float) totalNotas / 50;

        System.out.println("\nNúmero de aprovações do sexo masculino: " + aprovadosMasc);
        System.out.println("Número de Reprovações do sexo feminino: " + reprovadasFem);
        System.out.println("Média das notas femininas: " + mediaNotasFem);
        System.out.println("Média geral das notas: " + mediaGeral);
        System.out.println("===== RELATÓRIO DE APROVADOS =====");
        System.out.println("Nome     |    Nota");
        for (int i = 0; i < j; i++) {
            System.out.println(nomesAprovados[i] + "          " + notasAprovados[i]);
        }
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro