package com.company.generics;

import java.util.Stack;

public class StrictStack<T extends Comparable<T>> implements Comparable<T> {

    Stack<T> stack = new Stack<T>();

    private T t;

    public T getT() {
        return this.t;
    }

    public StrictStack() {
    }

    // void push(T) // put onto stack
    public void push(T t) {
        this.stack.add(t);
    }

    // T top() // return top of stack
    public T top() {
        return this.stack.peek();
    }

    // void pop() // pop and discard top of stack
    public void pop() {
        this.stack.pop();
    }

    // int size() // number of elements in stack
    public int size() {
        return this.stack.size();
    }

    @Override
    public int compareTo(T o) {
       return getT().compareTo(o);
    }


    public int compareTo(StrictStack<T> other) {
        return getT().compareTo(other.getT());
    }


}
