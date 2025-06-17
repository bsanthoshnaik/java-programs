import java.util.*;
import javax.script.*;

public class SmartCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Smart Calculator ===");

        char operation = showMenu();

        double result = 0;

        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            result = basicOperation(operation);
        } else if (operation == 'e') { // expression mode
            result = evaluateExpression();
        } else {
            System.out.println("Invalid choice.");
            return;                        
        }

        System.out.println("Result = " + result);

        chooseDataStructure();
    }

    static char showMenu() {
        System.out.print("Choose operation: +  -  *  /  (e = expression) > ");
        String input = sc.nextLine().trim();
        return input.isEmpty() ? ' ' : input.charAt(0);
    }

    static double basicOperation(char op) {
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        while (op == '/' && b == 0) {
            System.out.print("Invalid: Division by zero. Enter second number again: ");
            b = sc.nextDouble();
        }

        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    static double evaluateExpression() {
        sc.nextLine(); // clear buffer
        while (true) {
            System.out.print("Enter expression: ");
            String expr = sc.nextLine();

            if (expr.contains("/0")) {
                System.out.println("Invalid: Division by zero detected.");
                continue;
            }

            try {
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                Object result = engine.eval(expr);
                return Double.parseDouble(result.toString());
            } catch (Exception e) {
                System.out.println("Invalid expression. Try again.");
            }
        }
    }

    static void chooseDataStructure() {
        System.out.print("\nChoose data structure: 1.ArrayList 2.LinkedList 3.Queue > ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                handleArrayList();
                break;
            case 2:
                handleLinkedList();
                break;
            case 3:
                handleQueue();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    static void handleArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            list.add(val);
        }
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }

    static void handleLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter initial LinkedList values (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            list.add(val);
        }

        boolean done = false;
        while (!done) {
            System.out.print("Choose: 1.Add 2.Remove 3.Display 4.Exit > ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter value to add: ");
                    list.add(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value to remove: ");
                    list.remove(Integer.valueOf(sc.nextInt()));
                    break;
                case 3:
                    System.out.println("LinkedList: " + list);
                    break;
                case 4:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static void handleQueue() {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter 10 queue values:");
        for (int i = 0; i < 10; i++) {
            queue.add(sc.nextInt());
        }

        System.out.print("How many elements to delete? ");
        int del = sc.nextInt();
        int rotations = 0;

        while (del-- > 0 && !queue.isEmpty()) {
            queue.poll();
            rotations++;
        }

        System.out.println("Queue after deletion: " + queue);
        System.out.println("Rotations performed: " + rotations);
    }
}