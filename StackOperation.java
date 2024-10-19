import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack: " + stack);
        int poppedValue = stack.pop();
        System.out.println("Popped Value: " + poppedValue);
        int peekedValue = stack.peek();
        System.out.println("Peeked Value: " + peekedValue);
        int valueToSearch = 20;
        int index = stack.search(valueToSearch);
        if (index != -1) {
            System.out.println("Value " + valueToSearch + " found at index (1-based): " + index);
        } else {
            System.out.println("Value " + valueToSearch + " not found in the stack.");
        }
        System.out.println("Stack after pop: " + stack);
    }
}
