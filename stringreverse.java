public class stringreverse {
    public static void main(String[] args) {
        String str="sairam";
        StringBuilder sr=new StringBuilder(str);
        String reversed=sr.reverse().toString();
        System.out.println("original:"+str);
        System.out.println("reverse:"+reversed);
    }
    
}
