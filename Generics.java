/*
 * Bhai float ke .f lagana padta hai
 * 0.9f 0.8f 
 * double ke liye d . 0.88d
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

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Min-Max program.");

        System.out.println(getMaxFloat(233.3f, 43.4f, 1.0f));
        System.out.println(getMaxFloat(99.0f, 355.5f, 42.9f));
        System.out.println(getMaxFloat(33.7f, 81.2f, 9999.9f));
    }
}
