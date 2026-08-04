import java.util.*;

public class BubbleSort<T extends Comparable<T>> {

    private void troca(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public T[] sort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        for (int fase = 1; fase < n; fase++) {
            // j controla comparações
            for (int j = 0; j < n - fase; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    troca(array, j, j + 1);
                }
            }
        }
        return array;
    }// fim sort

    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

    public T[] sortVerbose(T[] array, Comparator<T> comparator) {
        int n = array.length;
        int comparacoes = 0;
        for (int fase = 1; fase < n; fase++) {
            System.out.println("Fase " + fase + ": " + Arrays.toString(array));
            // j controla comparações
            for (int j = 0; j < n - fase; j++) {
                System.out.println("Comparando: " + array[j] + " e " + array[j + 1]);
                comparacoes++;
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    System.out.println("Trocando: " + array[j] + " e " + array[j + 1]);
                    troca(array, j, j + 1);
                }
            }
        }
        System.out.println("Total de comparações: " + comparacoes);
        return array;
    }// fim sort

    public T[] sortVerbose(T[] array) {
        return sortVerbose(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

}
