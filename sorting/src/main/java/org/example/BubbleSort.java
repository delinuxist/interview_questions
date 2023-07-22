package org.example;

public class BubbleSort {

    public int[] sort(int[] array) {

        for(int i =0; i < array.length;i++) {
            for (int j = i+1; j < array.length;j++ ){
                if(array[i] > array[j]){
                    swap(array,i,j);
                }
            }
        }
        return array;
    }

    private void swap(int[] array,int i,int j) {
        if(i == j) return;
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
