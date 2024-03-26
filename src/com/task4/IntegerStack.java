package com.task4;
import java.util.EmptyStackException;

public class IntegerStack {
	

	
	    private int[] stackArray;
	    private int top;
	    private int capacity;

	    public IntegerStack(int capacity) {
	        this.capacity = capacity;
	        stackArray = new int[capacity];
	        top = -1; // Stack is initially empty
	    }

	    // Method to check if the stack is empty
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Method to check if the stack is full
	    public boolean isFull() {
	        return top == capacity - 1;
	    }

	    // Method to push an element onto the stack
	    public void push(int element) {
	        if (isFull()) {
	            System.out.println("Stack overflow. Cannot push element onto the stack.");
	            return;
	        }
	        stackArray[++top] = element;
	        System.out.println("Element " + element + " pushed onto the stack.");
	    }

	    // Method to pop an element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        int poppedElement = stackArray[top];
	        top--;
	        System.out.println("Element " + poppedElement + " popped from the stack.");
	        return poppedElement;
	    }

	    public static void main(String[] args) {
	        IntegerStack stack = new IntegerStack(5);

	        // Pushing elements onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        // Popping elements from the stack
	        stack.pop();
	        stack.pop();
	        stack.pop();

	        // Trying to pop from an empty stack
	        stack.pop(); // This will throw an EmptyStackException
	    }
	}



