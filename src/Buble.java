public class Buble {
    private Integer[] list;
    private int lastIndex;

    public Buble(Integer[] list) {
        this.list = list;
        this.lastIndex = list.length - 1;
    }

    public void sort3() {
        for (int i = 0; i < lastIndex; i++) {
            for (int j = lastIndex; j > i; j--) {
                if (list[j].compareTo(list[j - 1]) < 0) {
                    Integer x = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = x;
                }
            }
        }
    }

    // Method to get the list
    public Integer[] getList() {
        return this.list;
    }
}
