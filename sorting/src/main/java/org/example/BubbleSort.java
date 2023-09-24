package org.example;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        System.out.println("---Sort from the beginning---");
        var sortedArr = sortAscending(intArray);
        for(int i : sortedArr){
            System.out.println(i);
        }

        System.out.println("---Sort from the end---");
        var sortArr = sortDescending(intArray);
        for(int i : sortArr){
            System.out.println(i);
        }

    }

    public static int[] sortAscending(int[] arr) {

        for(int i =0; i < arr.length;i++) {
            for (int j = i+1; j < arr.length;j++ ){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }
    
    public static int[] sortDescending(int[] arr){
        
        for(int lastSorted = arr.length - 1; lastSorted > 0; lastSorted--) {
            for(int j= 0;j < lastSorted;j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }

        return arr;
    }

    private static void swap(int[] array,int i,int j) {
        if(i == j) return;
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
