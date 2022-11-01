package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 * 
 */
public class Stack<E> implements Iterable<E> {
    
    private List<E> stack = new ArrayList<>();
    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        stack.add(0, element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return stack.remove(0);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return stack.get(0);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        return stack.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return stack.size();
    }
    
    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> l = new ArrayList<E>(stack);
        Collections.reverse(l);
        return l;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }
        return sum;
    }

    public static void prettyPrint(Stack<?> stack) {
        Iterator<?> itr = stack.iterator();
        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println(o);
        }
        
    }
        

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }

}