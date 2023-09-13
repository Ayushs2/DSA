public class Basics {
    public static void main(String[] args) {
        // space is also a character
        // if we add space it is also a character ASCII value 32
        char ch = ' ';
        int n = (int) ch;
        System.out.println(n);
        //compare two strings
        String s = "hello";
        String g = "world";
        int k = s.length();
        int m = g.length();
        //string is a character array to is loops through each character
        //and tells the length
        System.out.println(k + " " + m);
        System.out.println(s.charAt(2));

    }
    //charAt(), length(), contains(), indexOf(), LastIndexOf()
    //toLowerCase(), toUpperCase()
    //1 byte = 8 bits
    //ASCII -> 0-127 -> 2^7
    //primitive Data types - int, char, float
    //derived data type - Array, ArrayList, String
    //String = list of characters(character array) - 2- byte
    // "hello" - 10 byte.
    //in c++ it is 1 byte


}

