package com.company;

public class PowerOfNoRecursion {
    public static void main(String[] args) {
        System.out.println(power(12, 39907139));
    }

    static long power(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        long ans = a * power(a, b - 1);
        long x = ans%1000000007;
        return ans;
    }
}
