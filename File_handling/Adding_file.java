package File_handling;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Adding_file {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("C:\\Users\\vuchander\\Desktop\\StudentData112.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext())
        {
            System.out.print(sc.next());

        }
        sc.close();
    }


}

