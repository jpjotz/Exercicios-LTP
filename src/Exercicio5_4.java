// Exercício 5.4 - Faça um programa em Java para corrigir as provas de uma disciplina. A prova é
// composta de 10 questões de múltipla escolha, cada uma com alternativas de A até E. Primeiramente o
// programa deverá receber via teclado a digitação do gabarito de respostas da prova. em seguida, o
// programa deverá receber para cada aluno a digitação do número de matrícula e as respostas das 10
// questões da prova. O programa deverá calcular e imprimir a nota de cada aluno.
// Como resultados finais o programa deverá imprimir:
// - o percentual de alunos aprovados (60% de acertos ou mais)
// - a nota que apareceu com maior frequência na turma.
// Observações:
// - adotar um FLAG para encerrar a entrada de dados.
// - para este exercício você deverá criar um vetor para armazenar o Gabarito e outro acumular a
// frequência de notas da turma (Similar ao exercício 5.2 desta atividade).
// - para calcular o percentual aprovado use a fórmula:
// Percentual = Num. Alunos Aprovados * 100 / Num. Alunos na Turma

import java.util.*;

public class Exercicio5_4 {
    public static void main(String[] args) {
        char[] gabarito = new char[10];
        char[] respostas = new char[10];
        int[] frequencia = new int[11];
        int matricula, totalAlunos = 0, aprovados = 0;
        int maiorFrequencia = 0;
        int notaMaisFrequente = 0;
        float percentualAprovados;
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o gabarito da questão " + (i + 1) + " (A, B, C, D ou E)" + ": ");
            gabarito[i] = leia.next().charAt(0);
        }

        while (true) {
            int nota = 0;

            System.out.print("Digite a matrícula do aluno (999 para encerrar o programa): ");
            matricula = leia.nextInt();

            if (matricula == 999) {
                break;
            }

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite a resposta do aluno na questão " + (i + 1) + ": ");
                respostas[i] = leia.next().charAt(0);
            }

            for (int i = 0; i < 10; i++) {
                if (respostas[i] == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Nota do aluno: " + nota);

            if (nota >= 6) {
                aprovados++;
            }

            totalAlunos++;
            frequencia[nota]++;
        }

        for (int i = 0; i < 11; i++) {
            if (frequencia[i] > maiorFrequencia) {
                maiorFrequencia = frequencia[i];
                notaMaisFrequente = i;
            }
        }

        percentualAprovados = (aprovados * 100.0f) / totalAlunos;
        System.out.println("\nPercentual de alunos aprovados: " + percentualAprovados + "%");
        System.out.println("Nota mais frequente: " + notaMaisFrequente);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro