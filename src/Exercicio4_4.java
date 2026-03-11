// Exercício 3.4 - Fazer um programa em Java para receber via teclado a Matrícula (número), o Nome e
// as três Notas que os Alunos obtiveram na disciplina LTP durante o semestre. Considere que a Nota
// Final da disciplina é a soma destas três notas, e que serão aprovados os alunos com Nota Final maior
// ou igual a 60. Desta forma, para cada aluno digitado, exibir na tela a Nota Final na disciplina e se o aluno
// foi Aprovado ou Reprovado na disciplina. Ao final, exibir na tela:
// - a quantidade total de alunos da turma;
// - a média aritmética de notas finais da turma;
// - o Nome e a nota do aluno que obteve a maior nota final;
// Obs: para indicar o final da digitação, o usuário vai digitar a Matrícula 999 (flag).

import java.util.*;

public class Exercicio4_4 {
    public static void main(String[] args) {

        int matricula;
        String nome;

        float nota;
        float somaNotasAluno;
        float somaTurma = 0;
        float mediaTurma;

        float maiorNota = 0;
        String melhorAluno = "";

        int totalAlunos = 0;
        int contador;

        Scanner leia = new Scanner(System.in);

        while (true) {

            contador = 1;
            somaNotasAluno = 0;

            System.out.print("\nDigite a matrícula do aluno (999 para sair): ");
            matricula = leia.nextInt();
            leia.nextLine();

            if (matricula == 999) {
                break;
            }

            System.out.print("Digite o nome do aluno: ");
            nome = leia.nextLine();

            while (contador <= 3) {

                System.out.print("Digite a nota " + contador + ": ");
                nota = leia.nextFloat();

                somaNotasAluno += nota;
                contador++;

            }

            System.out.printf("Nota final: %.2f\n", somaNotasAluno);

            if (somaNotasAluno >= 60) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }

            somaTurma += somaNotasAluno;
            totalAlunos++;

            if (somaNotasAluno > maiorNota) {
                maiorNota = somaNotasAluno;
                melhorAluno = nome;
            }

        }

        if (totalAlunos > 0) {
            mediaTurma = somaTurma / totalAlunos;

            System.out.println("\n===== RESULTADO FINAL =====");
            System.out.println("Total de alunos: " + totalAlunos);
            System.out.printf("Média da turma: %.2f\n", mediaTurma);
            System.out.println("Melhor aluno: " + melhorAluno + " - Nota: " + maiorNota);
        } else {
            System.out.println("Nenhum aluno foi digitado.");
        }
    }
}

// Código feito por: João pedro do Espírito Santo Ribeiro