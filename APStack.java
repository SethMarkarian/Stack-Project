
/**
 * A stack is a data structure that works like a literal
 * stack of plates or cards, etc. You can do the following
 * with a stack:
 * 
 * - Add a new item to the top.
 * - Remove an item from the top.
 * - Look at the item on top but not remove it.
 * - Get the size of the stack.
 * 
 * One important feature of a stack is that you ONLY have
 * direct access to the top item.
 * 
 * This interface specifies the method headers for a Stack
 * data structure.
 */
public interface APStack<T>
{
    /**
     * Adds a new item to the top of the stack.
     * This increments the size.
     */
    void push(T x);
    
    /**
     * Removes and returns the top item in the stack.
     * This decrements the size.
     */
    T pop();
    
    /**
     * Returns but does not remove the top item in the stack.
     * This does not change the size.
     */
    T peek();
    
    /**
     * Returns the size.
     */
    int size();
}
