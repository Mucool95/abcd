import java.io.*;
import java.util.*;

import javax.security.auth.kerberos.DelegationPermission;

public class FileH { 
static void create(){
        try{
        File obj = new File("NewFile1.txt");
        if(obj.createNewFile()){
            System.out.println("Successfully created");
        }
        else{
            System.out.println("Already Exist");
        }
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
        
    }
static void write1(String name, String mail){
    try {
FileWriter writer = new FileWriter("NewFile.txt",true);
 writer.write(name+"\t"+mail+"\n");
 writer.close();
 System.out.println("new data saved");
    } catch (Exception e) {
        System.out.println(e);
    }
}
static void read(){
   try{
    String dat = "Second Line";
    File obj =new File("NewFile.txt");
    Scanner read = new Scanner(obj);
    while(read.hasNextLine()){
        String data = read.nextLine();
        System.out.println(data);
        if(data.contains(dat))
        {
            System.out.println("Exist");
            
        }
        else{System.out.println("Doesn't exist");}
        
    }read.close();
} catch(Exception e){
    System.out.println(e);
}

}
static void del(){
    try {
        File obj = new File("Newfile1.txt");
        obj.delete();
    } catch (Exception e) {
        System.out.println(e);
    }
}
    public static void main(String[] args) {
     read();
    }
}

