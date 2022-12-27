package basics.control_statements;

public class IfElse {
    public static void main(String[]args){
        java.util.Scanner  scanner = new java.util.Scanner(System.in);
        System.out.print("Condition true?(Yes/No): ");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("True");
        }
        else if(choice.equalsIgnoreCase("no")){
            System.out.println("False");
        }
        else{
            System.out.println("Wrong choice!");
        }
    }
}
