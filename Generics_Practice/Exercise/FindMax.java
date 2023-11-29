package Exercise;

import java.util.List;

public class FindMax {

    public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {
        if (list == null || list.isEmpty() || begin >= end || begin < 0 || end > list.size()) {
            return null; // Return null if the list is empty or the range is invalid
        }

        T maxElement = list.get(begin); // Initialize maxElement with the element at begin index

        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(maxElement) > 0) {
                maxElement = current; // Update maxElement if a greater element is found
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(5, 2, 9, 1, 7, 4, 8, 3);
        int startIdx = 1;
        int endIdx = 6;

        Integer result = max(myList, startIdx, endIdx);
        System.out.println("The maximal element in the range [" + startIdx + ", " + endIdx + ") is: " + result);
    } 
}
    


