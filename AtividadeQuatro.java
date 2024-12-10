import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Verificador de Primos");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para verificar");
        int num = sc.nextInt();
        boolean isPrimo = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo) {
            System.out.println( num + "  é Primo");
        }else{
            System.out.println( num + " não é Primo");
        }
        }

    }