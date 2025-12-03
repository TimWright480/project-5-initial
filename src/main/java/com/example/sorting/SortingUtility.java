package com.example.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingUtility {

    /**
     * Sorts an array using Gnome Sort algorithm (Part A)
     * Follows pseudocode exactly – variables: pos, a
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {

        int pos = 0;

        // Walk through the array like a garden gnome
        while (pos < a.length) {
            // If at the start OR in correct order → move forward
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos = pos + 1;
            } else {
                // Otherwise swap backward and move back
                swap(a, pos, pos - 1);
                pos = pos - 1;
            }
        }
    }

    /**
     * Sorts an array using Cocktail Shaker Sort algorithm (Part B)
     * Bidirectional bubble sort — variables: swapped, a, i
     */
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {

        boolean swapped;

        do {
            swapped = false;

            // Forward pass
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // No swaps → sorted
            }

            swapped = false;

            // Backward pass
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

        } while (swapped);
    }


    /**
     * Sorts an array using Shell Sort (Part C)
     * Ciura gaps stored in ArrayList — variables: gaps, n, i, j, temp
     */
    public static <T extends Comparable<T>> void shellSort(T[] a) {

        ArrayList<Integer> gaps = new ArrayList<>(
                Arrays.asList(701, 301, 132, 57, 23, 10, 4, 1)
        );

        int n = a.length;

        // For each gap
        for (int gap : gaps) {

            for (int i = gap; i < n; i++) {

                T temp = a[i];
                int j = i;

                // Gapped insertion sort
                while (j >= gap && a[j - gap].compareTo(temp) > 0) {
                    a[j] = a[j - gap];
                    j = j - gap;
                }

                a[j] = temp;
            }
        }
    }

    /** Provided swap method */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}



