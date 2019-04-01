
/**
 * A class that uses an array to implement the methods
 * in the APStack<T> interface.
 */
public class APArrayStack<T> implements APStack<T>
{
    private Object[] stack;
    private int size;
    
    public APArrayStack() {
        stack = new Object[10];
        size = 0;
    }
    
    public void push(T x) {
        size++;
        resize();
        stack[size-1] = x;
    }
    
    public T pop() {
        T temp = (T) stack[size-1];
        stack[size-1] = null;
        size--;
        return temp;
    }
    
    public T peek() {
        return (T) stack[size-1];
    }
    
    public int size() {
        return size;
    }
    
    private void resize() {
        if(size == stack.length - 2){
            Object[] temp = new Object[stack.length * 2];
            for(int i = 0; i < size; i++){
                temp[i] = stack[i];
            }
            stack = temp;
        }
    }
}
