package com.company;

public class InsertionSort {
    public int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x= array[i];
            int temp = i-1;
            while(temp >= 0 && array[temp] > x) {
                array[temp+1] = array[temp];
                temp = temp-1;
            }
            array[temp+1] = x;
        }
        return array;
    }

    public void displaySort(int[] array) {
        for (int j : array) {
            System.out.print(" "+j);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();

        int array[] = {40,30,10,70,50,20,60};
        int [] sortedArray = sort.insertionSort(array);
        sort.displaySort(sortedArray);
    }
}