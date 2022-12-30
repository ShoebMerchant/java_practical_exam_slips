import java.io.*;

/**
 * Write a program to read the contents of abc.txt file. Display the contents
 * of file in uppercase as output
 */

public class Q2 {
    public static void main(String[] args) throws Exception {
        // File path is passed as parameter
        File file = new File("D:\\codes\\college\\Java\\practical_exams\\slip_18\\abc.txt");

        // Note: Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st.toUpperCase());
    }
}
