public class ReverseNoRecursion {
    public static void main(String[] args) {
        rev2(76);

    }
//    static int rev(int n){
//        if (n==0)
//            return 0;
//        if (n<10){
//            System.out.print(n);
//            return n;}
//        int re = n%10;
//        System.out.print(re);
//        rev(n/10);
//     return re;

        static int rev2(int n){
            if (n==0)
                return 0;
            if (n<10){
                System.out.println(n);
                return n;}
            System.out.print(n%10);
            return rev2(n/10);

    }

}
