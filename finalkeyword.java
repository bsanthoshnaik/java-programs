public class finalkeyword {
    public static void main(String[] args) {
        class demo{
            void show(){
                final int n=100;
                System.out.println("number:"+n);
            }
        }
        demo d=new demo();
        d.show();
    }
    
}
