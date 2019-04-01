
/**
 * Complete the methods below.
 * 
 * 1. Balanced delimiters
 * 
 * 2. flipStack()
 * 
 * 3. maxInAStack()
 * 
 */
public class StackCodingBat
{
    /**
     * This method should use a Stack to check a string to make
     * sure the parentheses and square brackets are balanced.
     * 
     * Example of balanced: [---(****)----(**)---]
     * 
     * Example of unbalanced: [----[----)***]
     * 
     * See tester for more examples.
     * 
     * Please use a stack for this problem (use the stack class you wrote).
     * You should loop over the string and add the OPENING delimiters
     * to the stack. Then check the top of the stack against any closing
     * delimieters that appear.
     */
    private static boolean checkDelimiters(String s) {
        APStack<String> stack = new APArrayStack<String>();
        for (int i = 0; i<s.length()-1;i++){
            if (s.substring(i,i+1).equals("[")||s.substring(i,i+1).equals("(")) stack.push(s.substring(i,i+1));
            if (s.substring(i,i+1).equals("]")){
                if(stack.size()==0) return false;
                if(stack.pop().equals("(")) return false;
            }
            if (s.substring(i,i+1).equals(")")){
                if(stack.size()==0) return false;
                if(stack.pop().equals("[")) return false;
            }
        }
        return true;
    }
    
    /**
     * Given a stack, return a stack equal to the given stack,
     * flipped over.
     */
    private static APStack<Integer> flipStack(APStack<Integer> stack) {
        APStack<Integer> ans = new APArrayStack<Integer>();
        int len = stack.size();
        for (int i = 0; i < len;i++){
            ans.push(stack.pop());
        }
        return ans;
    }
    
    /**
     * Given a stack of Integers, return the largest number
     * in the stack. The stack should be UNCHANGED after the method
     * is finished.
     */
    private static Integer maxInAStack(APStack<Integer> stack) {
        Integer[] array = new Integer[stack.size()];
        for(int i = 0; i<array.length;i++){
            array[i] = stack.pop();
        }
        int max = array[0];
        for (int i = 0; i<array.length;i++){
            if(array[i]>max) max=array[i];
        }
        for(int i = 1; i<=array.length;i++){
            stack.push(array[array.length-i]);
        }
        return max;
    }
    
    public static void tester() {
        System.out.println("Problem 1: checkDelimiters");
        System.out.println(true == checkDelimiters("------"));
        System.out.println(true == checkDelimiters("*(-----)"));
        System.out.println(true == checkDelimiters("[-----]*"));
        System.out.println(false == checkDelimiters("[****)*"));
        System.out.println(false == checkDelimiters(")-----(-"));
        System.out.println(false == checkDelimiters("[-**--)-"));
        System.out.println(false == checkDelimiters("(--***]-"));
        System.out.println(true == checkDelimiters("[--(**)----]***"));
        System.out.println(true == checkDelimiters("(--[**]----)***"));
        System.out.println(false == checkDelimiters("(--[**)----)***"));
        System.out.println(false == checkDelimiters("(--[**]----]***"));
        System.out.println(true == checkDelimiters("(---(----[***]---)--)"));
        System.out.println(false == checkDelimiters("(---[----[***)---)--)"));
        System.out.println(true == checkDelimiters("(-(***)--(----[***]--[****]-)--)"));
        
        System.out.println("Problem 2: flipStack");
        int[] a = {2, 4, 6, 8};
        APStack<Integer> s = new APArrayStack<Integer>();
        for(int x : a) {
            s.push(x);
        }
        APStack<Integer> t = flipStack(s);
        for(int x : a) {
            System.out.println(x == t.pop());
        }
        
        int[] b = {1, 3, 5, 7, 9};
        APStack<Integer> u = new APLinkedStack<Integer>();
        for(int x : b) {
            u.push(x);
        }
        APStack<Integer> v = flipStack(u);
        for(int x : b) {
            System.out.println(x == v.pop());
        }
        
        System.out.println("Problem 3: maxInAStack");
        
        int[] c = {3, 7, 2, 9, 4};
        APStack<Integer> m = new APArrayStack<Integer>();
        for(int x : c) {
            m.push(x);
        }
        System.out.println(9 == maxInAStack(m));
        for(int i = c.length - 1; i >= 0; i--) {
            System.out.println(c[i] == m.pop());
        }
        
        int[] d = {-8, -4, -6, -2, -1, -5};
        APStack<Integer> n = new APArrayStack<Integer>();
        for(int x : d) {
            n.push(x);
        }
        System.out.println(-1 == maxInAStack(n));
        for(int i = d.length - 1; i >= 0; i--) {
            System.out.println(d[i] == n.pop());
        }
    }
}
