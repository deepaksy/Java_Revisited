package file_handling;
import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void readFile(String path){
        try{
            File file = new File(path);
            Scanner data = new Scanner(file);
            while(data.hasNextLine()){
                System.out.println(data.next());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean createFile(String filename){
        try{
            File obj = new File(filename);
            if(obj.createNewFile()){
                System.out.println("File Created Successfully.");
                return true;
            }
            else{
                return false;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String path="file.txt";
//        createFile(path);
        readFile(path);
    }
}
