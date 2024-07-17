public class BubbleSort {
    public static void main(String[] args) throws Exception {

        int[] vetor = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado");
        for (i = 0; i<10; i++){
            System.out.println(" "+vetor[i]);

        }
        System.out.println(" ");

        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado");
        for (i = 0; i < 10; i++) {
            System.out.println("" + vetor[i]);
        }
    }
}
