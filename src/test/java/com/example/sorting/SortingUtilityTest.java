package com.example.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortingUtilityTest {

    // Utility to verify array is sorted
    private <T extends Comparable<T>> void assertSorted(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1].compareTo(arr[i]) <= 0,
                    "Array is not sorted at index " + i);
        }
    }

    // ---- TEST GROUP: GNOME SORT ---- //

    @Test
    public void testGnomeSort_empty() {
        Integer[] a = {};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_single() {
        Integer[] a = {5};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_sorted() {
        Integer[] a = {1,2,3,4,5};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_reverse() {
        Integer[] a = {5,4,3,2,1};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_duplicates() {
        Integer[] a = {3,1,4,1,5,9,2,6,5,3};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_allSame() {
        Integer[] a = {5,5,5,5,5};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_twoSwapped() {
        Integer[] a = {2,1};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_twoSorted() {
        Integer[] a = {1,2};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_random() {
        Integer[] a = {64,34,25,12,22,11,90};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }

    @Test
    public void testGnomeSort_strings() {
        String[] a = {"zebra","apple","mango","banana"};
        SortingUtility.gnomeSort(a);
        assertSorted(a);
    }


    // ---- TEST GROUP: COCKTAIL SHAKER SORT ---- //

    @Test
    public void testCocktail_empty() {
        Integer[] a = {};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_single() {
        Integer[] a = {5};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_sorted() {
        Integer[] a = {1,2,3,4,5};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_reverse() {
        Integer[] a = {5,4,3,2,1};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_duplicates() {
        Integer[] a = {3,1,4,1,5,9,2,6,5,3};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_allSame() {
        Integer[] a = {5,5,5,5,5};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_twoSwapped() {
        Integer[] a = {2,1};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_twoSorted() {
        Integer[] a = {1,2};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_random() {
        Integer[] a = {64,34,25,12,22,11,90};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }

    @Test
    public void testCocktail_strings() {
        String[] a = {"zebra","apple","mango","banana"};
        SortingUtility.cocktailShakerSort(a);
        assertSorted(a);
    }


    // ---- TEST GROUP: SHELL SORT ---- //

    @Test
    public void testShell_strings() {
        String[] a = {"pear", "apple", "orange", "banana"};
        SortingUtility.shellSort(a);
        assertSorted(a);
    }

    @Test
    public void testShell_reverse() {
        Integer[] a = {9,8,7,6,5,4,3,2,1};
        SortingUtility.shellSort(a);
        assertSorted(a);
    }
}
