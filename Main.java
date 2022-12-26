
class Tcg{
   
   static class Java{
       static void developer(){
            System.out.println("Java Developer");
        }
    }
    class Server{
        void admin(){
            System.out.println("System Admin");
        }

    }
}

public class Main{
public static void main(String[] args) 
    {  
        //Tcg ob = new Tcg();
        Tcg.Java obj =new Tcg.Java();
        obj.developer();

        
    }
}



