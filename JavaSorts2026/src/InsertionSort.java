public class InsertionSort<T extends Comparable<T>> {

    public void sort(T[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {

            T currentValue = inputArray[i];

            int j = i - 1;

            while (j >= 0 && inputArray[j].compareTo(currentValue) > 0) {

                inputArray[j + 1] = inputArray[j];

                j--;
            }

            inputArray[j + 1] = currentValue;
        }
    }
}