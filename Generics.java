public class Generics {
     public static int getMaxInt(int a, int b, int c) {
        if(a>b && a>c)return a;
        else if (b>a && b>c)return b;
        else return c;    
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Generics Min-Max program.");

       
        System.out.println(getMaxInt(23, 43, 1));
        System.out.println(getMaxInt(99, 35, 42));
        System.out.println(getMaxInt(33, 81, 89));
        System.out.println(getMaxInt(45, -1, 29));
      

    }

    
   
}