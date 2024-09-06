import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {


        int[] vetor = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira 3 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("\nValores inseridos:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }

        double soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        double media = soma / vetor.length;

        System.out.println("Média dos valores: " + media);
    }
}