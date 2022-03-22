package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        File obj4 = new File("SelectedStudents.csv");
        try {
            obj4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter obj6= null;
        try {
            obj6 = new FileWriter("SelectedStudents.csv");
            obj6.write("hello");
            obj6.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
