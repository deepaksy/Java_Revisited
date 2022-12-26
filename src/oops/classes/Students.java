package oops.classes;

public class Students {
    public int id;
    public String name;
    public int roll;

    Students(){
        System.out.println("Constructor called");
    }
    Students(int id,String name,int roll){
        this.id=id;
        this.name=name;
        this.roll=roll;
    }

    static void printStudentDetails(Students s){
        System.out.println("Name: "+s.name);
        System.out.println("ID: "+s.id);
        System.out.println("Roll no: "+s.roll);
    }
    public static void main(String[] args) {
        Students s = new Students(12,"Deepak",32);
        printStudentDetails(s);

    }
}
