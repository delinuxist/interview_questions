package org.example;

public class Stack<T> {

    private final T[] arr;
    private final Integer capacity;

    private  Integer first;

    public Stack(T[] arr) {
        this.arr = arr;
        this.first = -1;
        this.capacity = arr.length;
    }

    public void push(T value) {
        if(first == capacity -1) {
            throw new RuntimeException("Stack is full");
        }
        this.arr[++this.first] = value;
    }

    public T pop() {
        if(first == -1) {
            throw new RuntimeException("Stack is empty");
        }
       return this.arr[this.first--];
    }

    public T peek() {
        return this.arr[first];
    }

    public void printStack() {
        for (int i = 0; i <= first; i++){
            if(this.arr[i] == null) {
                return;
            }
            System.out.println(this.arr[i]);
        }
    }
}
