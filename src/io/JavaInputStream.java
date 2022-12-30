package io;

import java.io.FileInputStream;
import java.io.InputStream;

public class JavaInputStream {
    public static InputStream is;

    public static void Input(){
        try{
            is = new FileInputStream("write.txt");
            System.out.println(is.available()+"bytes.");
            int i=0;
            while((i=is.read())!=-1){
                System.out.print((char)(i));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Input();
    }
}
