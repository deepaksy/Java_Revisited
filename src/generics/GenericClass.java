package generics;

public class GenericClass {

    public <T extends Number> int Add(T t1,T t2){
        return t1.intValue()+t2.intValue();
    }

    public <K extends String> String printValue(K val){
        return val;
    }
    public GenericClass(){
        System.out.println("Generic class Called!");
    }

    public static void main(String[] args) {
        GenericClass obj = new GenericClass();

        System.out.println("Add: "+obj.Add(2,3));
        System.out.println("Value: "+obj.printValue("Deepak"));
    }
}
