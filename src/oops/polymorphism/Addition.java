package oops.polymorphism;

public class Addition {
    public static int Add(int a,int b){
        return a+b;
    }
    public static double Add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Add: "+Add(1,2));
        System.out.println("Add: "+Add(1.2,2.2));
    }
}
