public class Method3 {
        int a;
        int b;
        int add(){
            a=5;
            b=10;
            System.out.println(a+b);
            return 0;
        }
    
        public static void main(String[] args) 
        {   Main obj = new Main();
            obj.add();
            System.out.println(obj.a);
            System.out.println(obj.b);
    
        }
    }