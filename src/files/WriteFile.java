package files;
// java.io package -> FileWriter-> Character data
//Character stream - Unicode convention
// Byte Stream - Binary data

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    //FileWriter
    //1. character oriented stream
    //2. Convenient for text files:
        // works with char , string and char[]
    //3. Append : add content
    // filewriter extends OutputStreamWriter - connects character stream to byte stream
    String path;
    String currentData;

    public WriteFile(String path,String data){
        this.path = path;
        writeData(data,false);
    }

    public String writeData(String data,Boolean append){
        //return oldData
        String oldData = this.currentData;
        //Ternary operator
        this.currentData = append ? this.currentData + data : data;
        try{
//            FileWriter fw = new FileWriter(path,append);
//            fw.write(data);
//            fw.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(path,append));
            bw.write(data);
            bw.newLine();
            bw.close();
        }catch(IOException io){
            System.out.println(io);
        }
        return oldData;
    }
    }
