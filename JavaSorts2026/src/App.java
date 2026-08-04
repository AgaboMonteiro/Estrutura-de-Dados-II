import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static Integer[] vetorDeNumeros() {
        return new Integer[] {
                87, 14, 63, 29, 95
                //,41, 72, 8, 56, 33
        };
    }

    public static void main(String[] args) throws Exception {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] numeros = vetorDeNumeros();
        System.out.println("Vetor nao ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Vetor Ordenado:");
        bubbleSort.sortVerbose(numeros); // ordenando
        System.out.println(Arrays.toString(numeros));

        // Ordem decrescente
        numeros = vetorDeNumeros();
        bubbleSort.sort(numeros, Comparator.reverseOrder());

        System.out.println("\n=== Ordem decrescente ===");
        System.out.println(Arrays.toString(numeros));



    }
}
