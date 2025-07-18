public class superkeyword {
    public static void main(String[] args) {
        class dog{
            void sound(){
                System.out.println("bou bou");
            }
        }
        class cat extends dog{
            void sound(){
                super.sound();
                System.out.println("meao meao");
            }
        }
        cat c=new cat();
        c.sound();
    }
    
}
