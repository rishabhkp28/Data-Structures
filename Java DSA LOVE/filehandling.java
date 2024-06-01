import java.io.RandomAccessFile;
import java.io.IOException;

public class filehandling {
    public static void main(String args[]) throws IOException
    {
    RandomAccessFile file = new RandomAccessFile("C:\\Users\\SUNIL KUMSR\\Documents\\textfile.rtf", "rw");

    // Move the file pointer to the end of the file for appending

    // Append text to the file
            file.seek(file.length());
            file.writeBytes("\nthis is again extra\n \n");
            file.writeBytes("This is the extra data\nHello, World!\n");
            file.writeBytes("This is a test message.\n");

    // Close the file
            file.close();
            System.out.println("Data is written successfully");
    }
}
