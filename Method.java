public class Method {
   
	public static void main(String[] args) 
    {     
    try {
        int a=10;
        int b=0;
        System.out.println(b/a);
        System.out.println("Try Block");
    } catch (Exception e) 
    {
        System.out.println("Divide by zero is not defined");
    }
    finally{
        System.out.println("Try Block");
        System.out.println("Always Executed");
    }
    }
}









