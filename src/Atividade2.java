public class Atividade2 {
    public static void main(String[] args) {

        int[] vetor = new int[4];
        vetor[0] = 3;
        vetor[1] = 6;
        vetor[2] = 9;
        vetor[3] = 12;

        int soma = vetor[0] + vetor[3];

        System.out.println("Soma do primeiro e do último elemento é :");
        System.out.println("Vetor[0]: " + vetor[0]);
        System.out.println("Vetor[3]: " + vetor[3]);
        System.out.println("Soma: " + soma);
    }
}