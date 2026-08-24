import java.util.*;

public class BubbleSort<T extends Comparable<T>> {

    private long contaComparacoes;
    private long contaTrocas;

    public long getContaComparacoes() {
        return this.contaComparacoes;
    }

    public long getContaTrocas() {
        return this.contaTrocas;
    }

    private void troca(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public T[] sort(T[] array, Comparator<T> comparator) {

        int n = array.length;

        this.contaComparacoes = 0;
        this.contaTrocas = 0;

        for (int fase = 1; fase < n; fase++) {

            boolean comp = false;

            for (int j = 0; j < n - fase; j++) {

                this.contaComparacoes++;

                if (comparator.compare(array[j], array[j + 1]) > 0) {

                    troca(array, j, j + 1);

                    this.contaTrocas++;

                    comp = true;
                }
            }

            if (!comp)
                break;
        }

        return array;
    }

    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

    // ===================== SORT VERBOSE =====================

    public T[] sortVerbose(T[] array, Comparator<T> comparator) {

        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;
        int fases = 0;

        for (int fase = 1; fase < n; fase++) {

            fases++;

            boolean comp = false;

            System.out.println("\n=== Fase " + fase + " ===");
            System.out.println(Arrays.toString(array));

            for (int j = 0; j < n - fase; j++) {

                comparacoes++;

                System.out.println("\nComparação " + comparacoes + ": "
                        + array[j] + " x " + array[j + 1]);

                if (comparator.compare(array[j], array[j + 1]) > 0) {

                    trocas++;

                    System.out.println("Trocando " + array[j] + " e " + array[j + 1]);

                    troca(array, j, j + 1);

                    System.out.println(Arrays.toString(array));

                    comp = true;
                }
            }

            if (!comp)
                break;
        }

        System.out.println("\n===== RESULTADO COM FLAG =====");
        System.out.println("Total de fases: " + fases);
        System.out.println("Total de comparações: " + comparacoes);
        System.out.println("Total de trocas: " + trocas);

        return array;
    }

    public T[] sortVerbose(T[] array) {
        return sortVerbose(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

    // ===================== SEM FLAG =====================

    public T[] sortSemFlag(T[] array, Comparator<T> comparator) {

        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;
        int fases = 0;

        for (int fase = 1; fase < n; fase++) {

            fases++;

            for (int j = 0; j < n - fase; j++) {

                comparacoes++;

                if (comparator.compare(array[j], array[j + 1]) > 0) {

                    trocas++;

                    troca(array, j, j + 1);
                }
            }
        }

        System.out.println("\n===== RESULTADO SEM FLAG =====");
        System.out.println("Total de fases: " + fases);
        System.out.println("Total de comparações: " + comparacoes);
        System.out.println("Total de trocas: " + trocas);

        return array;
    }

    public T[] sortSemFlag(T[] array) {
        return sortSemFlag(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

    // ===================== COM FLAG =====================

    public T[] sortComFlag(T[] array, Comparator<T> comparator) {

        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;
        int fases = 0;

        for (int fase = 1; fase < n; fase++) {

            fases++;

            boolean houveTroca = false;

            for (int j = 0; j < n - fase; j++) {

                comparacoes++;

                if (comparator.compare(array[j], array[j + 1]) > 0) {

                    trocas++;

                    troca(array, j, j + 1);

                    houveTroca = true;
                }
            }

            if (!houveTroca)
                break;
        }

        System.out.println("\n===== RESULTADO COM FLAG =====");
        System.out.println("Total de fases: " + fases);
        System.out.println("Total de comparações: " + comparacoes);
        System.out.println("Total de trocas: " + trocas);

        return array;
    }

    public T[] sortComFlag(T[] array) {
        return sortComFlag(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

}