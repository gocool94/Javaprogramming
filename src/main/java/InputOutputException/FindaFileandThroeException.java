package InputOutputException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FindaFileandThroeException {

    public static void FindingtheFile() throws IOException {

        File newFile = new File("input2.txt");
        FileInputStream stream = new FileInputStream(newFile);
        System.out.println("The file is processed");
    }

    public static void main(String[] args) {
        try {
            FindingtheFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
