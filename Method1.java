public class Method1 {
   
        static int a;
        static int b;
        static int add(){
        a=5;
        b=10;
        System.out.println(a+b);
            return 0;
        }
    
        public static void main(String[] args) 
        {   add();
            System.out.println(a);
            System.out.println(b);
    
        }
    }