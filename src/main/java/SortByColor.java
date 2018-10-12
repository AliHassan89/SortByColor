/*

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent,
with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.

Example :

Input : [0 1 2 0 1 2]
Modify array so that it becomes : [0 0 1 1 2 2]

 */

package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortByColor {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1,
                2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1,
                0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1,
                2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        sortColors(list);
    }

    public static void sortColors(List<Integer> list) {

        if (list.isEmpty())
            return;

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (Integer num : list) {
            if (num.equals(0))
                ++zeros;
            else if (num.equals(1))
                ++ones;
            else
                ++twos;
        }

        int index = 0;
        while (zeros > 0) {
            list.set(index, 0);
            --zeros;
            ++index;
        }

        while (ones > 0) {
            list.set(index, 1);
            --ones;
            ++index;
        }

        while (twos > 0) {
            list.set(index, 2);
            --twos;
            ++index;
        }
    }
}
