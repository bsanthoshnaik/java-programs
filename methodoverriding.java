public class methodoverriding {
    public static void main(String []args){
   class a{
    public void display1(){
        System.out.println("iam in class a");
    }
   } 
   class B extends a{
    public void display(){
        System.out.println("iam in class b");
    }
   }
    B bo=new B();
    bo.display1();
    bo.display();
   }
}
