package com.company;

import java.util.ArrayList;
import java.util.List;

public class IterativeSubSeq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(iterativeSubset(arr));
    }

    public static List<List<Integer>> iterativeSubset(int arr[]) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                // List<Integer>a =  outer.get(i);
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
//               for(int x:a){
//                   inner.add(x);
//               }
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

}
// time complexity ->>> in each step subsets doubles so for n elements
// we have (2^n *n) we are creating n copies at every step so n for that
//space->>> o(2^n *n)
//             |   |
//   total subsets * space taken by each subset O(n)
/*
when we find a duplicate element, only add it
 */