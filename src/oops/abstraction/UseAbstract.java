package oops.abstraction;

public class UseAbstract extends AbstractClass{
    @Override
    public void greet() {
        System.out.println("Hello User!");
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        UseAbstract ua = new UseAbstract();
        System.out.println(ua.add(3,2));
    }
}
