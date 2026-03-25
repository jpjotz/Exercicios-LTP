// Exercício 4.5 - Pedra-papel-tesoura é um jogo envolvendo dois jogadores no qual cada jogador escolhe
// uma de 3 jogadas possíveis: “pedra”, “papel” ou “tesoura”. O resultado do jogo é determinado com base
// nas seguintes regras:
// • O jogador que escolher “pedra” perde o jogo se o outro escolher “papel” e ganha caso o outro
// escolha “tesoura”.
// • O jogador que escolher “papel” perde o jogo se o outro escolher “tesoura” e ganha caso o outro
// escolha “pedra”.
// • O jogador que escolher “tesoura” perde o jogo se o outro escolher “pedra” e ganha caso o outro
// escolha “papel”
// Caso ambos escolham a mesma jogada, o jogo é considerado um empate.
// Fazer um programa para identificar e exibir os ganhadores de um jogo pedra-papel-tesoura. O programa
// deverá receber como entrada de dados a digitação de sucessivas jogadas escolhida pelo jogador 1 e
// pelo jogador 2. Após cada jogada, o programa deverá identificar e exibir na console o jogador vencedor.
// O programa deve terminar se um dos jogadores introduzir uma jogada inválida.

import java.util.*;

public class Exercicio4_5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String escolhaJogador1;
        String escolhaJogador2;
        int vitoriasJogador1 = 0;
        int vitoriasJogador2 = 0;

        while (true) {

            System.out.print("Digite a jogada do Jogador 1: ");
            escolhaJogador1 = leia.nextLine();

            System.out.print("Digite a jogada do Jogador 2: ");
            escolhaJogador2 = leia.nextLine();

            if (!escolhaJogador1.equals("pedra") && !escolhaJogador1.equals("papel") && !escolhaJogador1.equals("tesoura") || !escolhaJogador2.equals("pedra") && !escolhaJogador2.equals("papel") && !escolhaJogador2.equals("tesoura")) {
                System.out.println("Jogo Terminado");
                break;
            }

            if (escolhaJogador1.equals("pedra")) {
                if (escolhaJogador2.equals("papel")) {
                    System.out.println("Jogador 2 Venceu!");
                    vitoriasJogador2++;
                } else if (escolhaJogador2.equals("tesoura")) {
                    System.out.println("Jogador 1 Venceu!");
                    vitoriasJogador1++;
                }
            } else if (escolhaJogador1.equals("papel")) {
                if (escolhaJogador2.equals("pedra")) {
                    System.out.println("Jogador 1 Venceu!");
                    vitoriasJogador1++;
                } else if (escolhaJogador2.equals("tesoura")) {
                    System.out.println("Jogador 2 Venceu!");
                    vitoriasJogador2++;
                }
            } else if (escolhaJogador1.equals("tesoura")) {
                if (escolhaJogador2.equals("pedra")) {
                    System.out.println("Jogador 2 Venceu!");
                    vitoriasJogador2++;
                } else if (escolhaJogador2.equals("papel")) {
                    System.out.println("Jogador 1 Venceu!");
                    vitoriasJogador1++;
                }
            }

            if (escolhaJogador1.equals(escolhaJogador2)) {
                System.out.println("Empate!");
            }

        }

        System.out.printf("======== PLACAR ======== \n Jogador 1: %d Pontos \n Jogador 2: %d Pontos \n========================",
                vitoriasJogador1,
                vitoriasJogador2);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro