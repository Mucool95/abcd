interface Tcg{
    void Array(); //abstract, public
    void Char();
    void list();
    void tuple();
    int a =5;
    String name = "Birmaram ji";
}

abstract class Java implements Tcg{
    public void Array(){}
    public void Char(){}
}

class Python extends Java{
    public void list(){}
    public void tuple(){}

}


public class Intf {
    public static void main(String[] args) {
        Java obj = new Jdbc();
        obj.show();
        obj.disp();
        System.out.println(obj.a);
        System.out.println(obj.name);

    }
}

