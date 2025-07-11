public class singleinheritence {
    public static void main(String[] args) {
        class tester{
            public void display1(){
                System.err.println("i am tester");
            }
    }
        class developer extends tester{
            public void display2(){
                System.err.println("iam developer");
            }
        }
        developer dp=new developer();
        dp.display1();
        dp.display2();
    }
    
}
