package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicatesInArray {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        int nums[] = new int[size];
//        int freq[] = new int[100001];
//
        for(int i=0; i<size; i++)
        {
            nums[i] = sc.nextInt();
           // freq[nums[i]]+=1;
        }
////
//
//        for(int i=0; i<100001; i++)
//        {
//            if(freq[i] >1)
//            {
//                System.out.print(i+ " ");
//            }
//        }
        duplicate(nums);
    }
    static void duplicate(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            if(hm.containsKey(i)){
                int of = hm.get(i);
                int nf = of+1;
                hm.put(i,nf);
            }
            else{
                hm.put(i,1);
            }
        }
        for (int i: hm.keySet()){
            if(hm.get(i)>1)
                System.out.println(i);
        }
    }
    }


