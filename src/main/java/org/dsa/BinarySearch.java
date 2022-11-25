package org.dsa;

public class BinarySearch {
    public static int Search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < array[middle]){
                right = middle - 1;
            }
            else if (target > array[middle]){
                left = middle + 1;
            }
            else return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8, 9, 11};
        System.out.println("Target number is present at index: " + BinarySearch.Search(array, 9));
    }
}
