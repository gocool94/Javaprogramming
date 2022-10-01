package InputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class OutputStreamvalue {

    public static void main(String[] args) {
    String data = "This is a dummy text that i am going to create";
        try {
            OutputStream out = new FileOutputStream("output.txt");

            byte[] dataBytes = data.getBytes();
            out.write(dataBytes);
            System.out.println("Data is written to the file");
            out.close();



    } catch (Exception e) {
        System.out.println("Prinnnntttt");
        System.out.println(e);
    }
}
}
