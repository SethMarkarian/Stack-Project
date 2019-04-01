
    
/**
 * A class that uses a linked data structure
 * to implement the methods
 * in the APStack<T> interface.
 */
public class APLinkedStack<T> implements APStack<T>
{
    private Link<T> bot;
    private int size;
    
    public APLinkedStack() {
        bot = null;
        size = 0;
    }
    
    public void push(T x) {
        Link<T> current = bot;
        if(size>0){
            while(current.next != null){
                current = current.next;
            }
            current.next = new Link(x);
        }else{
            bot = new Link(x);
        }
        size++;
    }
    
    public T pop() {
        Link<T> current = bot;
        Link<T> prev = null;
        if (size==0) {
            return null;
        }
        else if(size == 1) {
            T temp = current.data;
            current = null;
            size--;
            return temp;
        }
        else{
            while(current.next!=null){
                prev = current;
                current = current.next;
            }
            T temp = current.data;
            prev.next = null;
            size--;
            return temp;
        }   
    }
    
    public T peek() {
        Link<T> current = bot;
        while(current.next != null){
            current = current.next;
        }
        return current.data;
    }
    
    public int size() {
        return size;
    }
    
    private class Link<T> {
        public T data;
        public Link next;
        
        public Link(T x) {
            data = x;
        }
    }
}

