import java.util.*;

public class ExercicioTesteVetor {
    public static void main(String[] args) {
        int notas[] = new int[40];
        byte contador;
        int somaNotas = 0;
        float mediaNotas;
        byte quantAcimaMedia = 0;
        Scanner leia = new Scanner(System.in);

        for (contador = 0; contador <= 39; contador++) {
            System.out.println("Digite a nota do aluno " + (contador + 1) + ": ");
            notas[contador] = leia.nextInt();

            somaNotas += notas[contador];
        }

        mediaNotas = somaNotas / 40;

        for(contador = 0; contador <= 39; contador++) {
            if (notas[contador] > mediaNotas) {
                quantAcimaMedia++;
            }
        }

        System.out.println("Média das notas: " + mediaNotas);
        System.out.println("Quantidade de alunos com a nota acima da média: " + quantAcimaMedia);
    }
}
