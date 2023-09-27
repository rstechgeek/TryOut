package example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack {


    public Stack(int size) {
        this.stack = new ArrayList<>(size);
        this.size = size;
    }

    private List<Object> stack;
    private int top = -1;
    private int size;

    public Object pop() {
        return top();
    }

    public Object top() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        return stack.get(top);
    }

    public void push(Object data) {
        if (top >= size) {
            throw new StackOverflowError();
        }
        top++;
        stack.add(top, data);

    }

    public Boolean empty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

}
