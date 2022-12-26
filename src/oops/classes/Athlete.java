package oops.classes;
import oops.interfaces.Run;
public class Athlete implements  Run{
    @Override
    public void run() {
        System.out.println("Athlete is Running");
    }

    @Override
    public void stop() {
        System.out.println("Athlete stopped Running.");
    }

    public static void main(String[] args) {
        Athlete a = new Athlete();
        a.run();
        a.stop();
    }
}
