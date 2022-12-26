package generics;

public class GenericFunction<T>{
    protected T t1;
    public T getValue(){
        return  this.t1;
    }

    protected void setValue(T t){
        this.t1=t;
    }

    public static void main(String args[]){
        GenericFunction<Integer> gf = new GenericFunction<Integer>();
        gf.setValue(23);
        System.out.println("Value: "+gf.getValue());
    }
}
