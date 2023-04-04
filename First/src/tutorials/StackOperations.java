package firstPackage.First.src.tutorials;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //Pushing elements to the stack
        stack.push("India");
        stack.push("Canada");
        stack.push("New york");
        stack.push("China");
        System.out.println("Stack: " + stack);
        //to remove/pop the element form the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element is: " + poppedElement);
        System.out.println("Updated stack is : " + stack);

    }
}