package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesMethods {
    public static void main(String[] args) {
      // 1. open files
        //  2. read from file
        // 3. Writing to files
        // 4. Adding to files
        // 5. closing or delete the file
        try {
            // 1. Text Files ( .txt, .csv, .json ) Human readable files
            // 2. Binary Files ( .dat, .exe, .sh ) Machine readable files

            // Take user input for file name + data
            // 1.change data
            // 2. Read data
            Scanner sc = new Scanner(System.in);
            String name,data;
            System.out.println("Enter file name: ");
            name = sc.nextLine();
            System.out.println("Enter data ");
            data = sc.nextLine();
            String path = "/home/agami-al-54/Desktop/Bank System/src/files/"+name;
            File file = new File(path);
            // 1. Absolute Path -> Full Path
            // 2. Relative Path -> Current working directory
            System.out.println("File object created");
            if (file.createNewFile()) {
                System.out.println("File created at: " + file.getAbsolutePath());
            }else{
                System.out.println("File already exists at: "+ file.getAbsolutePath());
            }
            WriteFile writeFile = new WriteFile(path,data);
            System.out.println("Enter option below:");
            System.out.println("1. replace data");
            System.out.println("2. append data");
            System.out.println("3. read data");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter new data");
                    data = sc.nextLine();
                    System.out.println(" old data: "+writeFile.writeData(data,false));
                    break;
                case 2:
                    System.out.println("Enter new data");
                    data = sc.nextLine();
                    System.out.println(" old data: "+writeFile.writeData(data,true));
                    break;
                case 3:
                    System.out.println(writeFile.currentData);
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println(file.getName());
            System.out.println(file.isAbsolute());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.canRead());
            System.out.println(file.length());


        } catch(IOException err){
            System.out.println("Error in file creation");
        }
    }
}
