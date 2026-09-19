public class App {

    public static Integer[] vetorDeNumeros() {
        return new Integer[]{
            14, 27, 39, 46, 55, 63, 71, 80, 92
        };
    }

    public static Integer[] gerarVetorAleatorio(int tamanho) {
        Integer[] vetor = new Integer[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 1000000);
        }

        return vetor;
    }

    public static void main(String[] args) {

        int n = 50000;
        long inicio, fim, tempo;

        System.out.println(
            "\n=== DEMONSTRACAO DE BUSCA (LINEAR E BINARIA) ==="
        );

        // Cria o vetor inicial
        Integer[] vetorBusca = gerarVetorAleatorio(n);

        // Faz uma cópia do mesmo vetor para ordenar
        Integer[] vetorBuscaOrdenado = vetorBusca.clone();

        // Ordena a cópia para poder utilizar a Busca Binária
        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.sort(vetorBuscaOrdenado);


        // =====================================================
        // ELEMENTO PRESENTE
        // =====================================================

        // Escolhemos um elemento que sabemos que existe
        // no vetor original
        Integer elementoPresente = vetorBusca[n / 2];


        // -------------------------
        // BUSCA LINEAR
        // -------------------------

        Busca<Integer> busca = new Busca<>();

        inicio = System.currentTimeMillis();

        int resultadoLinear = busca.linear(
            vetorBusca,
            elementoPresente
        );

        fim = System.currentTimeMillis();

        tempo = fim - inicio;

        System.out.println("\n*** Busca Linear - Presente ***");
        System.out.println("Elemento pesquisado: " + elementoPresente);
        System.out.println("Posicao encontrada: " + resultadoLinear);
        System.out.println("Comparacoes: " + busca.getContaComparacoes());
        System.out.println("Tempo: " + tempo + " ms");


        // -------------------------
        // BUSCA BINARIA
        // -------------------------

        inicio = System.currentTimeMillis();

        int resultadoBinaria = busca.binaria(
            vetorBuscaOrdenado,
            elementoPresente
        );

        fim = System.currentTimeMillis();

        tempo = fim - inicio;

        System.out.println("\n*** Busca Binaria - Presente ***");
        System.out.println("Elemento pesquisado: " + elementoPresente);
        System.out.println("Posicao encontrada: " + resultadoBinaria);
        System.out.println("Comparacoes: " + busca.getContaComparacoes());
        System.out.println("Tempo: " + tempo + " ms");


        // =====================================================
        // ELEMENTO AUSENTE
        // =====================================================

        // Como o vetor possui números de 0 até 999999,
        // -1 nunca estará presente.
        Integer elementoAusente = -1;


        // -------------------------
        // BUSCA LINEAR - AUSENTE
        // -------------------------

        inicio = System.currentTimeMillis();

        resultadoLinear = busca.linear(
            vetorBusca,
            elementoAusente
        );

        fim = System.currentTimeMillis();

        tempo = fim - inicio;

        System.out.println("\n*** Busca Linear - Ausente ***");
        System.out.println("Elemento pesquisado: " + elementoAusente);
        System.out.println("Resultado: " + resultadoLinear);
        System.out.println("Comparacoes: " + busca.getContaComparacoes());
        System.out.println("Tempo: " + tempo + " ms");


        // -------------------------
        // BUSCA BINARIA - AUSENTE
        // -------------------------

        inicio = System.currentTimeMillis();

        resultadoBinaria = busca.binaria(
            vetorBuscaOrdenado,
            elementoAusente
        );

        fim = System.currentTimeMillis();

        tempo = fim - inicio;

        System.out.println("\n*** Busca Binaria - Ausente ***");
        System.out.println("Elemento pesquisado: " + elementoAusente);
        System.out.println("Resultado: " + resultadoBinaria);
        System.out.println("Comparacoes: " + busca.getContaComparacoes());
        System.out.println("Tempo: " + tempo + " ms");
    }
}