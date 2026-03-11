import java.util.*;

public class Exemplo_While {
    public static void main(String[] args) {
        int numeroPar = 2;
        int valorFinal;
        int somaDosPares = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Insira um valor final para a soma dos pares: ");
        valorFinal = leia.nextInt();

        while(numeroPar <= valorFinal) {
            somaDosPares += numeroPar;
            numeroPar += 2;
        }

        System.out.println("A soma dos pares até " + valorFinal + " é igual a " + somaDosPares);
    }
}
