import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            nomes[i] = scanner.nextLine();
        }

        scanner.close();

        System.out.println("Nomes inseridos:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}