import java.util.*;
import java.util.Scanner;
public class Login {
   static ArrayList<String> books =new ArrayList<String>();
    //books=[a,b,c,d]
  static void newBook(String book)
    {   
        for (String string : books) {
            if(book.equals(string))
            {   System.out.println("already exist");
                throw new ArithmeticException("Already Exist");
            }
        books.add(string); 
        System.out.println(string);    
        }
    }
    static void issue(){
        for (String string : books) {
            System.out.println(string);    
            }   
    }
    public static void main(String[] args) {
     for(int i=0;i<5;i++){
        books.add("english+"+i);
     }
 
    }

}
