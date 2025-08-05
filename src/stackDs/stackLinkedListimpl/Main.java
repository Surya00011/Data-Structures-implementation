package stackDs.stackLinkedListimpl;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        System.out.println(stack.push("Surya"));
        System.out.println(stack.push("Engineer"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        stack1.push("Hello");
        stack1.push("World");
        stack1.forEach(System.out::println);
    }
}
