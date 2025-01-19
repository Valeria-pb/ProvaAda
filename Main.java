import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Abrindo o scanner
        Scanner scanner = new Scanner(System.in);
        // Imprimindo mensagem de comando
        System.out.print("Digite a quantidade de Alunos: ");

        // Iniciando variáveis
        int quantidadeAlunos = scanner.nextInt();
        String[] alunos = new String[quantidadeAlunos];
        double [] notas = new double[quantidadeAlunos];
        double  totalNotas = 0;

        // Laço for inicial, recebe nomes e notas dos alunos.
        for (int i = 0; i < quantidadeAlunos; i++) {
            scanner.nextLine();
            System.out.println("Digite o nome do aluno: " +(i+1) + "° aluno");
            alunos[i] = scanner.nextLine();
            System.out.println("Digite a nota do aluno: " +(i+1)+ "° aluno");
            notas[i] = scanner.nextDouble();
            totalNotas += notas[i];
        }
        // Calculando media das notas
        double mediaNotas = totalNotas / quantidadeAlunos;

        // Imprimindo resultados dos alunos com notas acima da média.
        System.out.println("Alunos acima da média: ");

        // Laço for para encontar os alunos com notas acima da média.
        for (int i = 0; i < quantidadeAlunos; i++) {
            if(notas[i] > mediaNotas) {
                System.out.println(alunos[i]);
            }
        }



        scanner.close();



    }
}

