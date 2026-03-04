// Exercicio 2.2 – Faça um programa em Java que receba via teclado o Ano, Mês e Dia de nascimento de
// uma pessoa e o Ano, Mês e Dia atual. Em seguida, o programa deverá calcular e exibir a idade da
// pessoa.


import java.util.*;;

public class Exercicio2_2 {
    public static void main(String[] args) {
        int diaNasc;
        int mesNasc;
        int anoNasc;
        int diaAtual;
        int mesAtual;
        int anoAtual;
        int idade;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu dia de nascimento: ");
        diaNasc = leia.nextInt();
        System.out.print("Digite seu mês de nascimento: ");
        mesNasc = leia.nextInt();
        System.out.print("Digite seu ano de nascimento: ");
        anoNasc = leia.nextInt();

        System.out.print("Digite o dia atual: ");
        diaAtual = leia.nextInt();
        System.out.print("Digite o mês atual: ");
        mesAtual = leia.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = leia.nextInt();

        idade = anoAtual - anoNasc;
        if (mesNasc > mesAtual || (mesNasc == mesAtual && diaNasc > diaAtual)) {
            idade--;
        }

        System.out.println("A idade é: " + idade);

    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro