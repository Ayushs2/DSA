package com.company;

public class DistinctPaths {
    public static void main(String[] args) {
        System.out.println(countpaths(0,0,3,3));
    }
    static int countpaths(int i,int j,int m,int n){
        if( i==m-1 || j== n-1)
            return 1;

        return countpaths(i,j+1,m,n)+countpaths(i+1,j,m,n);
    }
}
