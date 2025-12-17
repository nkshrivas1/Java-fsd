package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            // reads character by character
//            FileReader fr = new FileReader("/home/agami-al-54/Desktop/Bank System/src/files/buffer.txt");
//            int ch;
//            while((ch=fr.read()) != -1){
//                System.out.print((char)ch);
//            }
//            System.out.println(fr.read());
//            fr.close();
            String path = "/home/agami-al-54/Desktop/Bank System/src/files/buffer.txt";
            BufferedReader br = new BufferedReader( new FileReader(path));
            String ch;
            while((ch=br.readLine()) != null){
                System.out.println(ch);
            }
            System.out.println(br.readLine());
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
