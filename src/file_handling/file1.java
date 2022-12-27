package file_handling;

import java.io.File;
import java.io.IOException;

public class file1 {
    public File myObj = new File("file.txt");

    private static void file(){
        file1 f1 = new file1();
        // File Functions
        System.out.println("IS Readable: "+check(f1.myObj.canRead()));
        System.out.println("IS Writable: "+check(f1.myObj.canWrite()));
    }

    private static String deleteFile(File file){
        return file.delete()?"File Deleted Successfully!":"File Not Deleted";
    }

    private static String check(boolean b){
        return b?"Yes":"No";
    }

    private static String createFile(file1 file)  {
        try{
            return file.myObj.createNewFile()?"File Created Successfully!":"Error Creating File";
        }
        catch (IOException e){
            e.printStackTrace();
            return "Error Creating file";
        }
    }
    private static void printFileDetails(file1 file){
        System.out.println("Name: "+file.myObj.getName());
        System.out.println("FilePath: "+file.myObj.getAbsolutePath());
        System.out.println("Size: "+(file.myObj.length()/8));
    }

    private static void getListOfFile(){
        File f = new File("/");
        for(String s:f.list()) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
//        file();
        file1 f1 = new file1();
//        if(f1.myObj.exists()){
//            deleteFile(f1.myObj);
//        }
//        else{
//            createFile(f1);
//            printFileDetails(f1);
//        }
        getListOfFile();
    }
}
