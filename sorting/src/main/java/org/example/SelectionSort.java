package org.example;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        var sorted = sort(intArray);
        for(int i : sorted) {
            System.out.println(i);
        }

    }

    public static int[] sort(int[] arr) {

        for (int lastUnSorted = arr.length-1; lastUnSorted > 0; lastUnSorted--) {
            int largest = 0;
            for (int i = 1; i <= lastUnSorted; i++) {
                if(arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            int temp = arr[lastUnSorted];
             arr[lastUnSorted] = arr[largest];
             arr[largest] = temp;
        }

        return arr;
    }
}
