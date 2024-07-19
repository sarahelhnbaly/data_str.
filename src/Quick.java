public class Quick {

    private int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low-1); // Index of smaller element.
        for (int j=low; j<high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

    private void quickSort(int array[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex-1);
            quickSort(array, partitionIndex+1, high);
        }
    }

    public void sort(int array[]) {
        int lastIndex = array.length-1;
        quickSort(array, 0, lastIndex);
    }
}