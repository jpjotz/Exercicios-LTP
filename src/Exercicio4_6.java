// Exercício 4.6 - Uma empresa aérea quer controlar os custos de seus voos. Ela possui três voos diários
// de números 1,2 e 3. Todos os aviões possuem 100 lugares e os voos possuem preços diferenciados de
// passagem:
// → voo 1 ........ passagem R$ 100,00
// → voo 2 ........ passagem R$ 150,00
// → voo 3 ........ passagem R$ 200,00
// Porém o preço das passagens pode cair de acordo com a lotação de cada voo :
// → voo com 70 passageiros ou mais ........ passagem com 60% de desconto
// → voo com 50 a 69 passageiros .............. passagem com 30% de desconto
// → voo com menos de 50 passageiros ..... passagem sem desconto
// Faça um programa em Java que receba via teclado a digitação da venda de passagens para os 3 voos
// contendo cada uma o Número do voo e a Quantidade de passagens vendidas. O algoritmo deverá
// calcular e imprimir o preço de cada passagem baseado na lotação do voo.
// Como resultados finais, o algoritmo deverá imprimir :
// a) o número do voo que arrecadou maior valor e o valor arrecadado
// b) a média da arrecadação dos 3 voos
// c) o valor da passagem mais barata e o número do voo correspondente
// obs. :
// → consistir a digitação do número do voo de forma a aceitar somente os valores 1, 2 ou 3
// → consistir a digitação do número de passagens vendidas para aceitar valores entre 0 e 100

import java.util.*;

public class Exercicio4_6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int voo, quantidadeVendas;
        double precoPassagem;

        double totalArrecadacao = 0;
        double maiorArrecadacao = 0;
        int vooMaior = 0;

        double menorPreco = Double.MAX_VALUE;
        int vooMaisBarato = 0;

        for (int i = 0; i < 3; i++) {

            do {
                System.out.print("Digite o código do voo (1, 2 ou 3): ");
                voo = leia.nextInt();

                System.out.print("Digite a quantidade de passagens vendidas (0 a 100): ");
                quantidadeVendas = leia.nextInt();

            } while ((voo != 1 && voo != 2 && voo != 3) ||
                    (quantidadeVendas < 0 || quantidadeVendas > 100));

            switch (voo) {
                case 1:
                    precoPassagem = 100;
                    break;
                case 2:
                    precoPassagem = 150;
                    break;
                default:
                    precoPassagem = 200;
            }

            if (quantidadeVendas >= 70) {
                precoPassagem -= precoPassagem * 0.6;
            } else if (quantidadeVendas >= 50 && quantidadeVendas <= 69) {
                precoPassagem -= precoPassagem * 0.3;
            }

            double arrecadacao = precoPassagem * quantidadeVendas;
            totalArrecadacao += arrecadacao;

            if (arrecadacao > maiorArrecadacao) {
                maiorArrecadacao = arrecadacao;
                vooMaior = voo;
            }

            if (precoPassagem < menorPreco) {
                menorPreco = precoPassagem;
                vooMaisBarato = voo;
            }

            System.out.println("Preço da passagem do voo " + voo + ": R$ " + precoPassagem);
            System.out.println("----------------------------------");
        }

        double media = totalArrecadacao / 3;

        System.out.println("\n====== RESULTADOS ======");
        System.out.println("Voo com maior arrecadação: " + vooMaior + " (R$ " + maiorArrecadacao + ")");
        System.out.println("Média de arrecadação: R$ " + media);
        System.out.println("Passagem mais barata: Voo " + vooMaisBarato + " (R$ " + menorPreco + ")");
    }
}

// Código feito: João Pedro do Espírito Santo Ribeiro