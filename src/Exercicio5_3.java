// Exercicio 5.3 - A Fumec deseja saber se existem alunos cursando simultaneamente as disciplinas
// Linguagem e Técnicas de Programação (LTP) e Cálculo. Faça um programa em Java que receba via
// teclado o número de matrícula dos alunos que estão cursando LTP (máximo 150 alunos) e dos alunos que
// estão cursando Cálculo (máximo 220). O algoritmo deverá calcular e imprimir o número de alunos que
// estão matriculados nas duas disciplinas.
// Obs: - Tanto para a digitação das matrículas na disciplina LTP quanto na disciplina Cálculo, adotar a
// matrícula 999 como flag para encerrar a entrada e dados.

import java.util.*;

public class Exercicio5_3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroMatricula;
        int alunosLtp[] = new int[150];
        int alunosCalculo[] = new int[220];
        int contadorAlunosSimultaneos = 0;
        int qtdLtp = 0, qtdCalculo = 0;

        for (int i = 0; i < 150; i++) {
            System.out.println("Digite o número de matrícula do aluno cursando LTP: ");
            numeroMatricula = leia.nextInt();
            if (numeroMatricula == 999) {
                break;
            }
            alunosLtp[i] = numeroMatricula;
            qtdLtp++;
        }

        for (int j = 0; j < 220; j++) {
            System.out.println("Digite o número de matrícula do aluno cursando Cálculo: ");
            numeroMatricula = leia.nextInt();
            if (numeroMatricula == 999) {
                break;
            }
            alunosCalculo[j] = numeroMatricula;
            qtdCalculo++;
        }

        for(int i = 0; i < qtdLtp; i++) {
            for(int j = 0; j < qtdCalculo; j++) {
                if (alunosLtp[i] == alunosCalculo[j]) {
                    contadorAlunosSimultaneos++;
                    break;
                }
            }
        }

        System.out.println("Alunos cursando LTP e Cálculo simultâneamente: " + contadorAlunosSimultaneos);

    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro