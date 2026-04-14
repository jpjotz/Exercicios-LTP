// Exercício 5.1 – A tabela a seguir contém em cada linha as 5 notas de provas obtidas por 30 alunos
// durante o período. O índice das linhas corresponde ao número do aluno, e o das colunas corresponde
// ao número da nota:
// 1 2 3 4 5
// 1 6.0 7.0 6.5 8.0 4.0
// 2 9.0 8.0 4.0 9.0 6.0
// 3 5.5 7.5 4.5 8.5 9.0
// ... ... ... ... ... ...
// 30 8.0 9.0 8.5 7.5 9.0
// Fazer um programa em Java para receber via teclado as 5 notas de cada um dos 30 alunos. O programa
// deverá calcular a média de cada aluno e a média da turma. Como resultado final o algoritmo deverá
// imprimir o relatório a seguir:
// número do aluno média do aluno
// 1 6.3
// 2 7.8
// 3 7.0
// ... ...
// 30 8.4
// média da turma: 7.38


import java.util.*;

public class Exercicio5_1 {
    public static void main(String[] args) {
        float nota;
        float mediaAlunos[] = new float[30];
        float somaNotasAluno = 0;
        float somaMedias = 0;
        Scanner leia = new Scanner(System.in);

        for (int contador = 0; contador <= 29; contador++) {
            somaNotasAluno = 0;
            for (int contadorNota = 0; contadorNota <= 4; contadorNota++) {
                System.out.print("Digite a nota " + (contadorNota + 1) + " do aluno " + (contador + 1) + ": ");
                nota = leia.nextFloat();
                somaNotasAluno += nota;
            }

            float mediaAluno = somaNotasAluno / 5;

            mediaAlunos[contador] = mediaAluno;
            somaMedias += mediaAlunos[contador];
        }

        float mediaTurma = somaMedias / 30;

        for(int i = 0; i < 30; i++) {
            System.out.println("Aluno " + (i + 1) + " | " + mediaAlunos[i]);
        }

        System.out.println("Média da turma: " + mediaTurma);

    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro