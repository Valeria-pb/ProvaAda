import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Alunos. ");
        int quantidadeAlunos = scanner.nextInt();

        String[] alunos = new String[quantidadeAlunos];
        double [] notas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = scanner.next();
            System.out.println("Digite a nota do aluno: ");
            notas[i] = scanner.nextDouble();
        }
        double  totalNotas = 0;
        for ( double nota : notas) {
            totalNotas += nota;
        }
        double mediaNotas = totalNotas / quantidadeAlunos;

        System.out.println(totalNotas);
        System.out.println(mediaNotas);

// Resolvi somente até aqui.

    }
}

