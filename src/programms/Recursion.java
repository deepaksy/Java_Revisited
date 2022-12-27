package programms;

public class Recursion {
    static public int sumOfNumbers(int n){
        if(n<=1){
            return n;
        }
        return n+sumOfNumbers(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(2));
    }
}
