package com.company;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                }
            }
        }
        return array;
    }


    public void displaySort(int[] array) {
        for(int i : array) {
            System.out.print(i+" ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();

        int array[] = {40,30,10,70,50,20,60,22,44};
        int [] sortedArray = sort.bubbleSort(array);
        sort.displaySort(sortedArray);
    }
}

