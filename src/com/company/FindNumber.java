package com.company;

import java.util.Scanner;

public class FindNumber {

    public int binarySearch(int[] array, int lower, int upper) {
        int mid = (lower + upper) / 2;
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1.Is Your Element Is Equal To Mid " + mid + "\n2.Is Your Element Is Greater Than Mid "
                    + mid + "\n3.Is Your Element Is Lower Than Mid " + mid);
            System.out.print("Enter Your Choice: ");
            int x = scan.nextInt();
            if (x == 1) {
                return mid;
            } else if (x == 2) {
                lower = mid + 1;
                return binarySearch(array, lower, upper);
            } else if (x == 3) {
                upper = mid - 1;
                return binarySearch(array, lower, upper);
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FindNumber find = new FindNumber();
        System.out.print("Upper Bound: ");
        int upper = scan.nextInt();
        int lower = 0;
        int[] array = new int[upper];
        System.out.println("Think One Number Between " + lower + " And " + upper + " \n");

        int result = find.binarySearch(array, lower, upper);

        if (result == -1) {
            System.out.println("Number Is Out Of Bound");
        } else {
            System.out.println("Your Number Is " + result);
        }
    }
}
