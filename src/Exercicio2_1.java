// Exercício 2.1 – Fazer um programa em Java que receba via teclado a idade de uma pessoa. Em
// seguida, se a pessoa possuir 18 ou mais anos, exibir a mensagem “Você é maior de idade”, caso
// contrário, exibir a mensagem “Você é menor de idade”. 

import java.util.*;

public class Exercicio2_1 {
    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro