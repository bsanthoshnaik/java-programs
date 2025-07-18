import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack content:"+stack);
        System.out.println("stack first elemement:"+stack.peek());
        System.out.println("stack content:"+stack);
        System.out.println("stack poop:"+stack.pop());
        System.out.println("stack content:"+stack);
        System.out.println("stack peek:"+stack.peek());
        System.out.println("stack content:"+stack);
        System.out.println("empty:"+stack.isEmpty());
        System.out.println("queue content:"+stack);
    }
    
}

