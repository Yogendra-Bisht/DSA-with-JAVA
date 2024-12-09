package com.Advance.Arrays;

public class LinearSearch_01 {
    public static void main(String[] args) {
        System.out.println("Question-: Write a program to search for a specific element in an array and print its index using linear search.");
        int[] example = {1,2,5,-2,5,3,8,9,33,57,24,-12,7};
        int[] example1 = {1,2,5,-2,57,3,8,9,33,24,-12,7};
        int[] example2 = {1,2,57,-2,5,3,8,9,33,24,-12,7};
        int[] example3 = {1,2,5,-2,5,3,8,9,33,24,-12,7};
        int[] example4 = {};
        int target = 57;
        search(example, target);
        search(example1, target);
        search(example2, target);
        search(example3, target);
        search(example4, target);

    }
    static int search(int[] arr, int target) {
        if(arr.length==0){

            System.out.println("Empty array");
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]) {
                System.out.println("Target " + target + " present at " + i);
                return i;
            }
//
        }
        System.out.println("Target not found");


        return -1;
    }
}
// It is the basics of linear search that we have to iterate over all the elements of array using a loop then we can do with that perticular index or element whatever we want to do