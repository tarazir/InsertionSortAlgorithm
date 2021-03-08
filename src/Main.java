// Program: Mr. Tarazi, ASK HS Technology Teacher
// Date: Monday, March 8th, 2021
// Objective: Demonstrating Insertion Sort Algorithm.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    // Demo Array illustration
        // intArray = [-15, 1 ,7  ,20, 35 , 55]
        int[] intArray = {20, 35, -15, 7, 55, 1, -22 };
        System.out.println(Arrays.toString(intArray));

        // firstUnsortedIndex  = 1 - this is first index of the unsorted partition
        // i = 0 - Index used to traverse the sorted partition from right to left
        // newElement = 35 - The value we want to insert into the sorted partition - array[firstUnsortedIndex]

        for (int firstUnsortedIndex =1 ; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i=firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }

        System.out.println(Arrays.toString(intArray));
    }
}
