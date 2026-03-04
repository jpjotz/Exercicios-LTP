// Exercício 2.7 – Faça um programa em Java que receba via teclado o Peso (em kg) e a Altura (em
// metros) de um atleta. O algoritmo deverá calcular e imprimir:
// - a situação da pessoa de acordo com a tabela de IMC (Índice de Massa Corporal) abaixo;
// - os pesos ideal mínimo e ideal máximo para que a pessoa esteja dentro da faixa de peso ideal de
// acordo com a tabela de IMC (Índice de Massa Corporal) abaixo;
// Tabela de IMC:
// - IMC menor que 20 → pessoa está na situação abaixo do peso
// - IMC entre 20 e 25 → pessoa está na situação de peso ideal
// - IMC maior que 25 → pessoa está na situação acima do peso
// Obs: - para calcular o IMC utilizar a fórmula: IMC = Peso / Altura2
// - para o peso ideal mínimo, utilizar a fórmula: Peso ideal mínimo = 20 * Altura2
// - para o peso ideal máximo, utilizar a fórmula: Peso ideal máximo = 25 * Altura2
// Segue um exemplo de dados para testar o programa:
//  Digite Altura = 1.75 e Peso = 80
// → situação = acima do peso
// → Peso Mínimo = 61.25 e Peso Máximo = 76.56

import java.util.*;
public class Exercicio2_7 {
    public static void main(String[] args) {
        float peso;
        float altura;
        float imc;
        float idealmin;
        float idealmax;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o peso (Kg): ");
        peso = leia.nextFloat();

        System.out.print("Digite a altura (Metros): ");
        altura = leia.nextFloat();

        imc = peso / (altura * altura);
        idealmin = (float) (20 * (altura * altura));
        idealmax = (float) (25 * (altura * altura));

        if (imc < 20) {
            System.out.println("Paciente abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Paciente no peso ideal");
        } else {
            System.out.println("Paciente acima do peso");
        }

        System.out.printf("Peso Mínimo: %.2f e Peso Máximo: %.2f", idealmin, idealmax);
    }
}

// Código feito por: João Pedro do Espírito Santo Ribeiro