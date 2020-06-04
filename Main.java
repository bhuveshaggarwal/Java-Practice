package com.bhuvesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] addX (int n, int arr1[], int x){
        int i;

        int newarr[] = new int[n+1];

        for (i = 0; i < n; i++)
            newarr[i] = arr1[i];

        newarr[n] = x;

        return newarr;
    }

    public static Integer[] addX(int n, Integer arr2[], int x)
    {
        int i;

        List<Integer> arrlist
                = new ArrayList<Integer>(
                Arrays.asList(arr2));

        arrlist.add(x);

        arr2 = arrlist.toArray(arr2);

        return arr2;
    }

    public static void main(String[] args) {
        int n = 10;
        int i;

        int arr1[]
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Initial Array:\n"
                + Arrays.toString(arr1));

        int x = 50;

        arr1 = addX(n, arr1, x);

        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr1));

        Integer[] arr2
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Initial Array:\n"
                + Arrays.toString(arr2));

        arr2 = addX(n, arr2, x);

        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr2));

    }
}
