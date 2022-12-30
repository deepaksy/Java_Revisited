package io;

import java.io.IOException;

/*
* In Java, 3 Streams are created for us automatically.
* All these streams are attached with the console.
* 1. System.out : Standard output stream.
* 2. System.in : Standard input stream.
* 3. System.err : Standard error stream.
* */
public class JavaIO {
    public static void InputStream() {
        try{
            System.out.print("Enter Character: ");
            int i = System.in.read();
            System.out.println("ASCII code: "+i+"\nCharacter: "+(char)i);
        }catch(IOException e){
            System.out.println("Error Occurred !");
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        InputStream();
    }
}
