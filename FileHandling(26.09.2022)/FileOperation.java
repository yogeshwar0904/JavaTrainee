package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * create a file object and
 * copy the path of the  any file  
 * you want to exicute in output and
 * paste in file object.
 */
public class FileOperation {
    public static void main(String[] args) {
        File showFile = new File("C:\\Users\\Lenovo\\Documents\\users.java");

        try {
            int size = (int)showFile.length();
            char [] fileSize = new char[size];
            FileReader fileReader = new FileReader(showFile);
            fileReader.read(fileSize);
            String fileCopy = new String(fileSize);
            System.out.println(fileCopy);
        } catch (IOException exception) {
            exception.printStackTrace(); 
        }
    }
}