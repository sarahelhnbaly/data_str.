public class Main {
    public static void main(String[] args) {
        // Test your sorting algorithms here
        ListArray<Integer> list = new ListArray<>(new Integer[]{9, 6, 4, 3, 9, 8, 2, 1});

        // Insertion Sort
        ListArray<Integer> insertionList = new ListArray<>(list.asArray());
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort1(insertionList);

        // Selection Sort
        ListArray<Integer> selectionList = new ListArray<>(list.asArray());
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort2(selectionList);

        // Bubble Sort
        ListArray<Integer> bubbleList = new ListArray<>(list.asArray());
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort3(bubbleList);

        // Quick Sort
        ListArray<Integer> quickList = new ListArray<>(list.asArray());
        QuickSort quickSort = new QuickSort();
        quickSort.sort4(quickList);

        // Merge Sort
        ListArray<Integer> mergeList = new ListArray<>(list.asArray());
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort5(mergeList);
    }
}