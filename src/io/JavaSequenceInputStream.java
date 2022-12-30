package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class JavaSequenceInputStream {
    public static InputStream is1;
    public static InputStream is2;
    public static void JavaSequenceStreamInput(){
        try{
            is1 = new FileInputStream("filetest1.txt");
            is2 = new FileInputStream("filetest2.txt");
            SequenceInputStream sis = new SequenceInputStream(is1,is2);
            int i;
            while((i=sis.read())!=-1){
                System.out.print((char)i);
            }
            sis.close();
            is1.close();
            is2.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JavaSequenceStreamInput();
    }
}
