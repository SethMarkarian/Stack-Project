
/**
 * Tester for the Stack classes.
 */
public class Tester
{
    public static void main() {
        APStack<String> stack1 = new APArrayStack<String>();
        APStack<String> stack2 = new APLinkedStack<String>();
        
        System.out.println("**************************");
        System.out.println("* First test: ArrayStack *");
        System.out.println("**************************");
        System.out.println();
        
        tester(stack1);
        
        System.out.println("****************************");
        System.out.println("* Second test: LinkedStack *");
        System.out.println("****************************");
        System.out.println();
        
        tester(stack2);
        
        System.out.println();
        System.out.println("****************************************");
        System.out.println("* Both tests should do the same thing. *");
        System.out.println("****************************************");
        System.out.println();
    }
    
    /**
     * You can plug either APArrayStack or APLinkedStack into
     * this method, because they both implement the APStack
     * interface. Polymorphism!
     */
    private static void tester(APStack<String> stack) {
        stack.push("c++");
        stack.push("python");
        stack.push("java");
        System.out.println("Should be 3: " + stack.size());
        
        System.out.println();
        
        System.out.println("Should be java: " + stack.peek());
        System.out.println("Should be 3: " + stack.size());
        
        System.out.println();
        
        System.out.println("Should be java: " + stack.pop());
        System.out.println("Should be 2: " + stack.size());
        
        System.out.println();
        
        System.out.println("Should be python: " + stack.peek());
        System.out.println("Should be 2: " + stack.size());
        
        System.out.println();
        
        System.out.println("Should be python: " + stack.pop());
        System.out.println("Should be 1: " + stack.size());
        
        System.out.println();
        
        System.out.println("Should be c++: " + stack.peek());
        System.out.println("Should be 1: " + stack.size());
        
        System.out.println();
        
        System.out.println("Should be c++: " + stack.pop());
        System.out.println("Should be 0: " + stack.size());
        
        System.out.println();
    }
}
