import java.util.Comparator;

public class Busca<T> {

    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }

    // Busca Linear
    public int linear(T[] array, T x) {

        this.contaComparacoes = 0;

        for (int i = 0; i < array.length; i++) {

            contaComparacoes++;

            if (x.equals(array[i])) {
                return i;
            }
        }

        return -1;
    }

    // Busca Binária
    public int binaria(T[] array, T x, Comparator<T> comparator) {

        this.contaComparacoes = 0;

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            contaComparacoes++;

            int comparacao = comparator.compare(x, array[meio]);

            if (comparacao == 0) {
                return meio;
            }

            if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }

    // Busca Binária utilizando Comparable
    public int binaria(T[] array, T x) {
        return binaria(
            array,
            x,
            (a, b) -> ((Comparable<T>) a).compareTo(b)
        );
    }
}