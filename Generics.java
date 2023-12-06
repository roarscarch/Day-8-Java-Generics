/*
 * Bhai float ke .f lagana padta hai
 * 0.9f 0.8f 
 * double ke liye d . 0.88d
 * 
 * compareTo method compares lexicographically in case of string 
 * it returns 3 values 1 , -1 and 0
 * when str1 is less than str2 compare to returns -1
 * else if str1 is greater than str2 compare to returns 1
 * else if str1 is equal to str2 compare to returns 0
 * 
 */

public class Generics {
    public static <T extends Comparable<T>> T getMax(T a, T b, T c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) return b;
        else return c;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Generics Min-Max program.");

        System.out.println(getMax("orange", "banana", "apple"));
        System.out.println(getMax("dog", "elephant", "cat"));
        System.out.println(getMax("java", "javascript", "python"));
    }
}