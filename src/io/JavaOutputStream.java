package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class JavaOutputStream {
    private static OutputStream os;
    public static void ReadFile(String filename){
        try{
            os = new FileOutputStream(filename);
            String s = "HI, I am an engineer, Computer Science engineer.";
            byte b[] = s.getBytes();
            os.write(b);
            os.close();
            System.out.println("Success writing to file.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Java BufferedOuputStream
    public static void JavaBufferedOutputStream(){
        try{
            os = new FileOutputStream("test.txt");
            BufferedOutputStream bos = new BufferedOutputStream(os);
            String s;
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            sc.close();
            bos.write(s.getBytes());
            bos.close();
            System.out.println("Success Buffered writing to file.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
//        ReadFile("write.txt");
        JavaBufferedOutputStream();
    }
}
