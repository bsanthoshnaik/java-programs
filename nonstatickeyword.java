public class nonstatickeyword {
    public static void main(String[] args) {
        class car{
        void nonstatic(){
            System.out.println("car stop");
        }
    }
    car c=new car();
    c.nonstatic();
}
    
}
