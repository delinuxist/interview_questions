package org.example;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        var sorted = sort(intArray);
        for(int i : sorted) {
            System.out.println(i);
        }
    }

    public static int[] sort(int[] arr) {

        for (int fistUnsortedIndex = 1; fistUnsortedIndex < arr.length; fistUnsortedIndex++) {
            int selectElement = arr[fistUnsortedIndex];

            int i;
            for(i=fistUnsortedIndex;i > 0 && arr[i-1] > selectElement;i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = selectElement;
        }
        return arr;
    }
}
