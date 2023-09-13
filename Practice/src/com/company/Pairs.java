package com.company;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
            Scanner ss = new Scanner(System.in);
            int N = ss.nextInt();
            int K = ss.nextInt();
            int count = 0;
            int[] array = new int[N];
            for(int i =0;i<N;i++){
                array[i] = ss.nextInt();
            }
            for(int i =0;i<N;i++){
                for(int j=i+1;j<N;j++){
                    if(array[i]-array[j] == K || array[j]-array[i] == K)
                    {
                        count++;
                    }
                }
            }
        System.out.println(count);



    }

    }





