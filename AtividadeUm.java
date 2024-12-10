import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do combustível por litro: ");
        double precoCombustivel = scanner.nextDouble();

        // Iniciando variaveis Distancia e Consumo
        double distancia = 360.0;
        double consumoMedio = 12.0;

        // Calcular a quantidade de litros necessários
        double consumoCombustivel = distancia / consumoMedio;

        // Calcular o custo total da viagem
        double custoTotal = consumoCombustivel * precoCombustivel;

        // Arredondar os valores para duas casas decimais
        consumoCombustivel = Math.round(consumoCombustivel * 100.0) / 100.0;
        custoTotal = Math.round(custoTotal * 100.0) / 100.0;

        // Exibir os resultados
        System.out.println("Litros de combustível necessários: " + consumoCombustivel);
        System.out.println("Custo total da viagem: R$ " + custoTotal);
    }
}
