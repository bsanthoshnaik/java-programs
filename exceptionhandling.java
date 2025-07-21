public class exceptionhandling {
    public static void main(String[] args) {
    try{
        int a=10;
        int b=0;
        int result=a/b;
        System.out.println("result:"+result);
    }
    catch(ArithmeticException e){
        System.out.println("error:cant divided by zero");
    }
    finally{
        System.out.println("block always run");
    }    
    System.out.println("program is always continue");
    }
}
