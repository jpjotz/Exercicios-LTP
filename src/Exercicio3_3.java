// Exercício 3.3 - Fazer um programa em Java para receber via teclado os tipos de vinho existentes no
// estoque de uma vinícula. Considere que a vinícula possui apenas 3 tipos de vinho das seguintes uvas:
// Cabernet Sauvignon, Malbec e Tanat. Na digitação, o usuário irá digitar as seguintes letras para
// representar cada tipo de vinho:
// - C para Cabernet Savion;
// - M para Malbec;
// - T para Tanat
// Ao final, o programa deverá exibir na tela:
// - A quantidade total de vinhos em estoque;
// - A quantidade de cada vinho no estoque;
// Obs: para indicar o final da digitação, o usuário vai digitar o tipo de vinho F (flag).

import java.util.*;

public class Exercicio3_3 {
    public static void main(String[] args) {

        char tipoVinho;
        int estoqueC = 0;
        int estoqueM = 0;
        int estoqueT = 0;
        int total;
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "\n(C para Cabernet Savion)\n (M para Malbec) \n (T para Tanat)\n (F para sair do programa)\n Digite o tipo de vinho: ");
            tipoVinho = leia.next().charAt(0);

            if (tipoVinho == 'f' || tipoVinho == 'F') {
                break;
            }

            switch (tipoVinho) {
                case 'c':
                case 'C':
                    estoqueC++;
                    break;

                case 'm':
                case 'M':
                    estoqueM++;
                    break;

                case 't':
                case 'T':
                    estoqueT++;
                    break;

                default:
                    System.out.println("Tipo de vinho inválido!");
            }

        }

        total = estoqueC + estoqueM + estoqueT;

        System.out.printf(
                " ===================\n Total de vinhos: %d \n Total Cabernet Savion: %d \n Total Malbec: %d \n Total Tanat: %d",
                total, estoqueC, estoqueM, estoqueT);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro