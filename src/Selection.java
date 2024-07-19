public class Selection<T extends Comparable<T>> {
    private T[] list;

    public Selection(T[] inputList) {
        this.list = inputList;
    }

    public void sort2() {
        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            int iMin = i;

            for (int j = i + 1; j < n; j++) {
                if (list[iMin].compareTo(list[j]) > 0)
                    iMin = j;
            }

            if (iMin != i) {
                T x = list[iMin];
                list[iMin] = list[i];
                list[i] = x;
            }
        }
    }
}
