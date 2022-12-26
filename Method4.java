public class Method4 {
   int a;
        int b;
        int add(){
            Main obj = new Main();
            obj.a=5;
            obj.b=10;
            System.out.println(obj.a+obj.b);
            return 0;
        }
    
        public static void main(String[] args) 
        {   Main obj = new Main();
            obj.add();
            System.out.println(obj.a);
            System.out.println(obj.b);
    
        }
    }