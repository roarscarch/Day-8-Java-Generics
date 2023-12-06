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

public class Generics<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;

    public Generics(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T findMaximum() {
        return Generics.findMaximum(var1, var2, var3);
    }

    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Min-Max program.");

       
        Generics<Integer> intMax = new Generics<>(10, 5, 8);
        System.out.println("Maximum Integer: " + intMax.findMaximum());

        
        Generics<Double> doubleMax = new Generics<>(23.5, 12.3, 15.7);
        System.out.println("Maximum Double: " + doubleMax.findMaximum());

        
        Generics<String> stringMax = new Generics<>("apple", "banana", "orange");
        System.out.println("Maximum String: " + stringMax.findMaximum());
    }
}
