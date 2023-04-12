package firstPackage.First.src.tutorials;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("India");
        stack.push("Canada");
        stack.push("New york");
        stack.push("China");
        System.out.println("Stack: " + stack);
        String poppedElement = stack.pop();
        System.out.println("Popped element is: " + poppedElement);
        System.out.println("Updated stack is : " + stack);
    }
}
//OUTPUT:-
// "C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=49693:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\anushrees\Desktop\Demo\DemoRepo\out\production\DemoRepo firstPackage.First.src.tutorials.StackOperations
//Stack: [India, Canada, New york, China]
//Popped element is: China
//Updated stack is : [India, Canada, New york]
//Process finished with exit code 0