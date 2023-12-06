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
    public static int getMaxInt(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

    public static float getMaxFloat(float a, float b, float c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

     public static String getMaxString(String a, String b, String c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Min-Max program.");

        System.out.println(getMaxString("orange", "banana", "apple"));
        System.out.println(getMaxString("dog", "elephant", "cat"));
        System.out.println(getMaxString("java", "javascript", "python"));
    }
}