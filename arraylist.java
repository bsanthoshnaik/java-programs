import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("ram");
        name.add("kiran");
        name.add("harsha");
        name.add("ram");
        System.out.println("name:"+name);
        System.out.println("first name:"+name.get(0));
        name.remove("kiran");
        System.out.println("after removeing shyam:"+name);
        System.out.println("size name:"+name.size());
        System.out.println("all name:"+name);
    }
    
}
