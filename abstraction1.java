abstract class robo{
    void display(){
        System.err.println("iam robo");
    }
    abstract void display1();
}
class sana extends robo{
    void display1(){
        System.out.println("iam sana");
    }
}
public class abstraction1 {
    public static void main(String[] args) {
        sana s=new sana();
        s.display1();
        s.display();
    }   
}
