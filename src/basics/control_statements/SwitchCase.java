package basics.control_statements;

public class SwitchCase {
    public static void run(int choice){
        switch(choice){
            case 1:
                System.out.println("You chose case 1");
                break;
            case 2:
                System.out.println("You chose case 2.");
                break;
            case 3:
                System.out.println("You chose case 3.");
                break;
            default:
                System.out.println("Default case Fired!.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int choice = new java.util.Scanner(System.in).nextInt();
        run(choice);
    }
}
