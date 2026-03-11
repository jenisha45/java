import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<Integer>();
        stack.push(9);
        stack.push(29);
        stack.push(6);
        stack.push(2);
        stack.push(4);
        stack.push(0);
        System.out.println(stack);
        System.out.println();
        System.out.println("top element="+stack.peek());
        System.out.println();
        System.out.println("position of 2 in stack="+stack.search(2));
        System.out.println();
        while (stack.size()!=0) {
            System.out.println(stack.pop());
        }
    }
}
