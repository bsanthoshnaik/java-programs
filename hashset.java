import java.util.ArrayList;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String>name=new HashSet<>();
        name.add("ram");
        name.add("kiran");
        name.add("harsha");
        name.add("ram");
        System.out.println("name:"+name);
        name.remove("kiran");
        System.out.println("after removeing shyam:"+name);
        System.out.println("size name:"+name.size());
        System.out.println("all name:"+name);
    }
    
}
