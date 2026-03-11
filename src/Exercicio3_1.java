// Exercício 3.1 - Fazer um programa em Java para receber via teclado a nota de 10 alunos da disciplina
// LTP. Considerando que para ser aprovado na disciplina os alunos devem ter notas iguais ou maiores
// que 60, após a digitação de cada nota, exibir na tela se o aluno está Aprovado ou Reprovado. Ao final,
// o programa deverá exibir a quantidade de alunos Aprovados e a quantidade de Reprovados. 

import java.util.*;

public class Exercicio3_1 {
    public static void main(String[] args) {
        int contador = 1;
        float nota;
        int aprovados = 0;
        int reprovados = 0;
        Scanner leia = new Scanner(System.in);

        while (contador <= 10) {
            System.out.print("Digite uma nota: ");
            nota = leia.nextFloat();

            if(nota >= 60) {
                System.out.println("Aprovado");
                aprovados++;
            } else {
                System.out.println("Reprovado");
                reprovados++;
            }

            contador++;
        }

        System.out.printf("Número de aprovados: %d \n Número de Reprovados: %d", aprovados, reprovados);
    }
}

// Código feito por João Pedro do Espírito Santo Ribeiro
