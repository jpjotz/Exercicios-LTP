// Exercício 2.5 – Fazer um programa em Java que receba via teclado o número de votos de 3 candidatos
// em duas seções eleitorais. Em seguida o programa deverá somar a quantidade de votos de cada
// candidato nas duas seções. Considerando que não há empate, o programa deverá verificar qual dos 3
// candidatos foi o vencedor e exibir na tela.


import java.util.*;
public class Exercicio2_5 {
    public static void main(String[] args) {
        int votoCandidato1;
        int votoCandidato1_2secao;
        int votoCandidato2;
        int votoCandidato2_2secao;
        int votoCandidato3;
        int votoCandidato3_2secao;
        int totalCandidato1;
        int totalCandidato2;
        int totalCandidato3;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade votos do candidato 1: ");
        votoCandidato1 = leia.nextInt();
        System.out.print("Digite a quantidade de votos do candidato 1 na segunda seção: ");
        votoCandidato1_2secao = leia.nextInt();

        System.out.print("Digite a quantidade votos do candidato 2: ");
        votoCandidato2 = leia.nextInt();
        System.out.print("Digite a quantidade de votos do candidato 2 na segunda seção: ");
        votoCandidato2_2secao = leia.nextInt();

        System.out.print("Digite a quantidade votos do candidato 3: ");
        votoCandidato3 = leia.nextInt();
        System.out.print("Digite a quantidade de votos do candidato 3 na segunda seção: ");
        votoCandidato3_2secao = leia.nextInt();

        totalCandidato1 = votoCandidato1 + votoCandidato1_2secao;
        totalCandidato2 = votoCandidato2 + votoCandidato2_2secao;
        totalCandidato3 = votoCandidato3 + votoCandidato3_2secao;

        if (totalCandidato1 > totalCandidato2 && totalCandidato1 > totalCandidato3) {
            System.out.printf("O candidato 1 venceu com %d votos!", totalCandidato1);
        } else if (totalCandidato2 > totalCandidato1 && totalCandidato2 > totalCandidato3) {
            System.out.printf("O candidato 2 venceu com %d votos!", totalCandidato2);
        } else if (totalCandidato3 > totalCandidato1 && totalCandidato3 > totalCandidato2){
            System.out.printf("O candidato 3 venceu com %d votos!", totalCandidato3);
        } else {
            System.out.println("Houve um empate!");
        }
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro