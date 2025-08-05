package stackDs.stackArrayImplemetation;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=5;i++){
            stack.push(i);
        }
        System.out.println(stack);
        for(int i=1;i<=5;i++){
            System.out.println(stack.pop());
        }

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}