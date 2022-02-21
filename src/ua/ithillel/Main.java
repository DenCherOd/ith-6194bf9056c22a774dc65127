package ua.ithillel;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 5000).toArray();

        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        sortArrayByParity.sortArrayByParity(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}