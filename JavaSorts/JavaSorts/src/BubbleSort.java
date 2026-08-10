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
             boolean comp = false;
            //j controla comparaçoes
            for (int j = 0; j < n - fase; j++) {

                // compare responsavel por comparar 2 objetos, se compare retornar valor maior que 0, então é maior
                if (comparator.compare(array[j], array[j + 1]) > 0){
                    troca(array,j,j+1);
                    comp = true;
                }

                if (!comp)
                    break;
            }
        }

        return array;
    }// fim sort

    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }


    //sort verboso
    public T[] sortVerbose(T[] array, Comparator<T> comparator) {
        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;
        int fases = 0;

        for (int fase = 1; fase < n; fase++) {
            fases ++;
            boolean comp = false;
            System.out.println("\n===Fase " + fase + "===: " + Arrays.toString(array));
            
            for (int j = 0; j < n - fase; j++) {

                comparacoes++;
                System.out.println("\n" + comparacoes + " Comparação: " + array[j] + " e " + array[j+1]);
                
                
                if (comparator.compare(array[j], array[j + 1]) > 0){
                    trocas++;
                    System.out.println("Trocando: " + array[j] + " e " + array[j + 1]);
                    troca(array,j,j+1);
                    System.out.println("Resultado: " + Arrays.toString(array));
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
    }// fim sortVerbose

    public T[] sortVerbose(T[] array) {
        return sortVerbose(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }




    // sort SEM FLAG
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
    System.out.println("Total de comparacoes: " + comparacoes);
    System.out.println("Total de trocas: " + trocas);

    return array;
}

public T[] sortSemFlag(T[] array) {
    return sortSemFlag(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
}//fim sort semflag

//sort comflag
    public T[] sortComFlag(T[] array, Comparator<T> comparator) {
        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;
        int fases = 0;

        for (int fase = 1; fase < n; fase++) {
            fases ++;
            boolean houveTroca = false;//FLAG
            
            for (int j = 0; j < n - fase; j++) {
                comparacoes++;                
                
                if (comparator.compare(array[j], array[j + 1]) > 0){
                    trocas++;

                    troca(array,j,j+1);
                    houveTroca = true;
                }
            }
                if (!houveTroca)
                    break;
        }
        
            System.out.println("\n===== RESULTADO COM FLAG =====");
            System.out.println("Total de fases: " + fases);
            System.out.println("Total de comparacoes: " + comparacoes);
            System.out.println("Total de trocas: " + trocas);

        return array;
    }// fim comflag

    public T[] sortComFlag(T[] array) {
        return sortComFlag(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }

}
