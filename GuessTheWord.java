import java.io.StreamCorruptedException;
import java.util.*;
class GenerateWord{

String word(){
String []movies = {"jeene nahi dunga","ddlj","indian","kgf2","pk"};
Random obj = new Random();
int index = obj.nextInt(movies.length-1);
    String word = movies[index];
    System.out.println(word);
    return word;
}
void check()
{
String word = word(); //"ddlj"
System.out.println("Guess the bollywood movie! length = " + word.length());
Scanner obj = new Scanner(System.in);
String temp[] = new String[word.length()];
 for(int i=0,j=0,k=0;j<=4 & i<word.length();)
{   String guess = obj.next();
     if(word.contains(guess)){
       int ind =word.indexOf(guess);
       temp[ind]=guess;
       word = word.replaceFirst(guess, "-");
       //System.out.println(word);
       i++;
       if(i== word.length()){
        System.out.println("You won");
                    break;}      
       for (String string : temp) {
            System.out.print(temp[k]);   
       }
    }
    else{
        System.out.println("Try Again");
        j++;

    }

    }

}

}

public class GuessTheWord {
    public static void main(String[] args) {
        GenerateWord obj = new GenerateWord();
        obj.check();

        
    }
}




/*
"jeene nahi dunga","ddlj","indian","kgf2","pk"
 random - ddlj

Guess the movie 
hint length - 4

z
ddlj.contains(z)  no

ddlj.contain(j) - yes

j =\0  -- ddl\0
ddlj.indexof(j)
temp[3]=j   ---j

l 
ddlj.contain(l) - yes
ddlj.indexof(l)
temp[2]=l 
ddlj -   dd\0\0

temp-  --lj*/





