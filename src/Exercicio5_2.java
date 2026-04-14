// Exercício 5.2 - Faça um programa em Java que receba via teclado um conjunto de 100 notas dos alunos
// da disciplina Linguagem e Técnicas de Programação. O programa deverá calcular e imprimir uma tabela
// contendo os valores das notas e a frequência absoluta da nota.
// Observações:
// - as notas digitadas serão inteiras de 0 a 10;
// - frequência absoluta é o número de vezes que uma nota aparece no conjunto.
// Exemplo do relatório:
// Tabela de notas e frequência
// Nota frequência absoluta
//  0 5
//  1 8
//  2 3
//  ... ...
//  9 23
// 10 13


import java.util.*;

public class Exercicio5_2 {
    public static void main(String[] args) {
        int nota;
        int frequencia[] = new int[11];
        Scanner leia = new Scanner(System.in);

        for(int contador = 0; contador < 100; contador++) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            nota = leia.nextInt();

            frequencia[nota]++;
        }

        System.out.println("Tabela de frequência");
        System.out.println("Nota" + " | " + "Frequência");

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " | " + frequencia[i]);
        }
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro