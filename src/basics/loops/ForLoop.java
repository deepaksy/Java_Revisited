package basics.loops;

public class ForLoop {
    public static void main(String[] args) {
        int i=0;
        for(;;){

            System.out.println(i);
            if(i==100){
                break;
            }
            i++;
        }
    }
}
