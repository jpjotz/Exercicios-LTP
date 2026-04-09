import java.util.*;

public class Exercicio_Extra {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomeCidade;
        int numeroVeiculosPasseio;
        int numeroAcidentesComVitimas;
        int maiorNumeroAcidentes = Integer.MIN_VALUE;
        int menorNumeroAcidentes = Integer.MAX_VALUE;
        String cidadeMaiorIndiceAcidentes = "";
        String cidadeMenorIndiceAcidentes = "";
        float mediaVeiculos;
        float mediaAcidentesMenos2000Veiculos = 0;
        int totalVeiculos = 0;
        int somaAcidenteCidMenor2000 = 0;
        int contCidMenor2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da cidade: ");
            nomeCidade = leia.next();

            do {
                System.out.print("Digite o número de veículos de passeio: ");
                numeroVeiculosPasseio = leia.nextInt();

                if (numeroVeiculosPasseio < 0 || numeroVeiculosPasseio > 100000) {
                    System.out.println("Digite um número de veículos de passeio entre 0 e 100.000");
                }
            } while (numeroVeiculosPasseio < 0 || numeroVeiculosPasseio > 100000);

            System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
            numeroAcidentesComVitimas = leia.nextInt();

            if (numeroAcidentesComVitimas > maiorNumeroAcidentes) {
                maiorNumeroAcidentes = numeroAcidentesComVitimas;
                cidadeMaiorIndiceAcidentes = nomeCidade;
            }

            if (numeroAcidentesComVitimas < menorNumeroAcidentes) {
                menorNumeroAcidentes = numeroAcidentesComVitimas;
                cidadeMenorIndiceAcidentes = nomeCidade;
            }

            totalVeiculos += numeroVeiculosPasseio;

            if (numeroVeiculosPasseio < 2000) {
                somaAcidenteCidMenor2000 += numeroAcidentesComVitimas;
                contCidMenor2000++;
            }

        }

        mediaVeiculos = totalVeiculos / 5;
        mediaAcidentesMenos2000Veiculos = somaAcidenteCidMenor2000 / contCidMenor2000;

        System.out.printf("\nMaior número de acidentes de trânsito: %d", maiorNumeroAcidentes);
        System.out.printf("\nCidade com maior número de acidentes: %s", cidadeMaiorIndiceAcidentes);
        System.out.printf("\nMenor quantidade de acidentes: %d", menorNumeroAcidentes);
        System.out.printf("\nCidade com menor número de acidentes: %s", cidadeMenorIndiceAcidentes);
        System.out.printf("\nMédia de quantidade de veículos: %.2f", mediaVeiculos);
        System.out.printf("\nMédia acidentes em cidades com menos de 2000 veículos: %.2f",
                mediaAcidentesMenos2000Veiculos);

    }
}
