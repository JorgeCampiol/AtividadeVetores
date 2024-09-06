public class Atividade3 {
    public static void main(String[] args) {
        // Passo 1: Declarar e inicializar o vetor
        int[] vetor = new int[2];
        vetor[0] = 5;
        vetor[1] = 10;


        System.out.println("Antes da troca:");
        System.out.println("Vetor[0]: " + vetor[0]);
        System.out.println("Vetor[1]: " + vetor[1]);

        int temp = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = temp;

        System.out.println("Depois da troca:");
        System.out.println("Vetor[0]: " + vetor[0]);
        System.out.println("Vetor[1]: " + vetor[1]);
    }
}