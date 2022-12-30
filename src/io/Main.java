package io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        OutputStream os;
        try{
            os = new FileOutputStream("Deepak.txt");
            os.write(78);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
