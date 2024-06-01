import java.io.RandomAccessFile;
import java.io.IOException;
public class bigdata1 {
    public static void main(String args[])throws IOException
    {
        RandomAccessFile file = new RandomAccessFile("C:\\Users\\SUNIL KUMSR\\Documents\\textfile.rtf","r");
        System.out.println(file.readLine());
        System.out.println(file.readLine());
        System.out.println(file.readLine());




    }
}
