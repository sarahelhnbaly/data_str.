public class Insertion<T extends Comparable<T>> {
    T[] list;
    int lastIndex;

    public Insertion(T[] list, int lastIndex){
        this.list = list;
        this.lastIndex = lastIndex;
    }

    public void sort1() {
        for (int i = 1; i <= lastIndex; i++) {
            T x = list[i];
            int j = i - 1;
            while (j >= 0 && x.compareTo(list[j]) < 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = x;
        }
    }

}
