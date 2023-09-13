package com.company;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] ch = {'e','e','e','e','e','e','n','n','n'};
        System.out.println(nextGreatestLetter(ch,'e'));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid;

        while (start<=end){

            mid = start+(end-start)/2;
            if (target==letters[letters.length-1])
                return letters[0];
            if (target>letters[letters.length-1])
                return letters[0];

            if(target == letters[mid]&& target!=letters[mid+1]){
                return letters[mid+1];
            }else if(target<letters[mid]){
                end = mid-1;


            }else {
                start = mid + 1;
        }


    } return letters[end+1];
}}
