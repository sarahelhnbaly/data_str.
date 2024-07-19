public class Merge<T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;
        List<T> left = list.subList(0, middle);
        List<T> right = list.subList(middle, list.size());

        return merge(sort(left), sort(right));
    }

    private List<T> merge(List<T> left, List<T> right) {
        List<T> result = new ArrayList<>();
        int leftPointer = 0, rightPointer = 0;

        while (leftPointer < left.size() && rightPointer < right.size()) {
            if (left.get(leftPointer).compareTo(right.get(rightPointer)) <= 0) {
                result.add(left.get(leftPointer));
                leftPointer++;
            } else {
                result.add(right.get(rightPointer));
                rightPointer++;
            }
        }

        // Consider remaining elements if any
        result.addAll(left.subList(leftPointer, left.size()));
        result.addAll(right.subList(rightPointer, right.size()));

        return result;
    }
}