// Exercício 2.4 - Fazer um programa em Java que receba via teclado o Nome do Aluno, a Nota1, a Nota2
// e a Nota3. O programa deverá calcular e imprimir a média e o desempenho do aluno baseado nas
// seguintes regras:
// - média de 7 para cima => aluno aprovado
// - média de 4 para baixo => aluno reprovado
// - média entre 4.1 e 6.9 => aluno em recuperação

import java.util.*;
public class Exercicio2_4 {
    public static void main(String[] args) {
        String nome;
        float nota1;
        float nota2;
        float nota3;
        float media;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = leia.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = leia.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = leia.nextFloat();
        System.out.print("Digite a terceira nota do aluno: ");
        nota3 = leia.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Média: %.2f - Aluno: %s aprovado!", media, nome);
        } else if (media <= 4) {
            System.out.printf("Média: %.2f - Aluno; %s reprovado!", media, nome);
        } else {
            System.out.printf("Média: %.2f - Aluno: %s em recuperação!", media, nome);
        }
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro