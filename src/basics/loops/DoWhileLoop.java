package basics.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
            if(i>100){
                break;
            }
        }while(true);
    }
}
