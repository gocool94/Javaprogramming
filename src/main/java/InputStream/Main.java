package InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        byte[] array = new byte[100];
        try {
            InputStream input = new FileInputStream("input.txt");
            System.out.println("Available bytes in the file : " +input.available());

            //Read byte from the input Stream
            input.read(array);
            System.out.println("Data Read from the file");



            String data = new String(array);
            System.out.println(data);

            input.close();

        } catch (Exception e) {
            System.out.println("Prinnnntttt");
            System.out.println(e);
        }
    }
}
