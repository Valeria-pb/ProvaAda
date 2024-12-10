import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ler a quantidade de Pessoas
        System.out.println("Quantos familiares vão comer a pizza? ");

        // Ler a quantidade de pedaços
        int quantidadeFamilia = sc.nextInt();
        System.out.println("Quantidade de pedaços da pizzas? ");
        int quantidadePeda = sc.nextInt();

        // Calcular a quantidade de pedaços por pessoa
        int divisaoPizza = quantidadePeda / quantidadeFamilia;
        System.out.println(divisaoPizza);


        // Calcular a quantidade de sobras
        int sobras = quantidadePeda % quantidadeFamilia;

        // Imprimir os resultados
        System.out.println("Cada pessoa vai receber " + divisaoPizza + " pedaços.");

        if (sobras > 0) {
            System.out.println("Sobrarão " + sobras + " pedaços.");
        } else {
            System.out.println("Não haverá sobras.");
        }

        // Verificar se a divisão é exata
        if (quantidadePeda % quantidadeFamilia != 0) {
            System.out.println("Para que todos recebam a mesma quantidade, seriam necessários mais " + (quantidadeFamilia - sobras) + " pedaços.");

        }
    }
}
