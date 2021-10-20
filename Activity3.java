package activity3;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) throws IOException {
        ArrayList<Email> emailList = new ArrayList<>();
        Email e1 = new Email("hau", "phung", "sale");
        Email e2 = new Email("hau", "phung", "sale");
        Email e3 = new Email("hau", "phung", "sale"); 

        emailList.add(e1);
        emailList.add(e2);
        emailList.add(e3);

        for( Email mail: emailList){
            System.out.println(mail.getEmail());
        }
//------------------------------------------------------------               
        try{
            File myFile = new File("test.csv");
            System.out.println(myFile.getAbsoluteFile());
            Scanner reader = new Scanner(myFile);
            
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("File not fuond....");
        }
//------------------------------------------------------------
        try {
            FileWriter writer = new FileWriter("file.csv");
            writer.write("This is the first line\n");
            writer.write("This is the secound line\n");
            writer.write("This is the third line\n");
        }catch(IOException e){
            System.out.println("Some errors!");
        }
        
//        try {
//            FileWriter writer = new FileWriter("file.csv");
//            Scanner reader = new Scanner ((Readable) writer);
//            while (reader.hasNextLine()){
//                String line = reader.nextLine();
//                System.out.println(reader);   
//            }
//            reader.close();
//        }catch(FileNotFoundException e){
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        EmailApp gui = new EmailApp();
        gui.setVisible(true);
    }
    
}
