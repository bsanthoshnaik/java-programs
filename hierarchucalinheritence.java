public class hierarchucalinheritence {
    public static void main(String[] args) {
        class tester{
            public void display1(){
                System.out.println("i am tester");
            }
    }
        class developer extends tester{
            public void display2(){
                System.out.println("iam developer");
            }
        }
        class hai extends tester{
            public void display3(){
                System.out.println("iam hai");
            }
        }
        hai dp=new hai();
        developer de=new developer();
        de.display1();
        de.display2();
        dp.display3();

        
    }
}
    

