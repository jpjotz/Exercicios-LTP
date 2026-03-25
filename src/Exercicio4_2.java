// Exercício 4.2 - Existem 3 candidatos à prefeito para a cidade XYZ. Feita a eleição, os votos serão
// digitados contendo os seguintes valores:
// 1 → indica que o voto foi no candidato número 1
// 2 → indica que o voto foi no candidato número 2
// 3 → indica que o voto foi no candidato número 3
// 4 → indica que o voto foi nulo
// 5 → indica que o voto foi em branco
// Sabendo que 150 eleitores compareceram a eleição e depositaram seus votos na urna, fazer um
// programa em Java que receba via teclado a digitação dos votos contidos na urna. Admitindo-se que não
// ocorrerão empates entre os candidatos e que a eleição seja válida, ou seja, um dos 3 candidatos será
// o vencedor, o algoritmo deverá calcular e imprimir :
// - qual foi o candidato vencedor;
// - o número de votos em branco;
// - o número de votos nulos;
// obs.: - consistir a digitação dos votos e aceitar apenas os números de 1 a 5.

import java.util.*;

public class Exercicio4_2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int voto;
        int somaVotoCandidato1 = 0;
        int somaVotoCandidato2 = 0;
        int somaVotoCandidato3 = 0;
        int somaVotosEmBranco = 0;
        int somaVotosNulos = 0;

        for (int x = 1; x <= 150; x++) {
            System.out.println("1 -> Votar no candidato 1");
            System.out.println("2 -> Votar no candidato 2");
            System.out.println("3 -> Votar no candidato 3");
            System.out.println("4 -> Votar nulo");
            System.out.println("5 -> Votar em branco");

            do {
                System.out.print("Digite o seu voto: ");
                voto = leia.nextInt();
            } while (voto < 1 || voto > 5);

            switch (voto) {
                case 1:
                    somaVotoCandidato1++;
                    break;

                case 2:
                    somaVotoCandidato2++;
                    break;

                case 3:
                    somaVotoCandidato3++;
                    break;

                case 4:
                    somaVotosNulos++;
                    break;

                case 5:
                    somaVotosEmBranco++;
                    break;

                default:
                    System.out.println("Digite um número válido!");
                    break;
            }
        }

        if (somaVotoCandidato1 > somaVotoCandidato2 && somaVotoCandidato1 > somaVotoCandidato3) {
            System.out.println("O vencedor foi o candidato 1!");
        } else if (somaVotoCandidato2 > somaVotoCandidato1 && somaVotoCandidato2 > somaVotoCandidato3) {
            System.out.println("O vencedor foi o candidato 2!");
        } else {
            System.out.println("O vencedor foi o candidato 3!");
        }

        System.out.printf("Total de votos em branco: %d", somaVotosEmBranco);
        System.out.printf("Total votos nulos: %d", somaVotosNulos);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro