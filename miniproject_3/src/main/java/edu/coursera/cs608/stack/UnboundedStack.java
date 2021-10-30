package edu.coursera.cs608.stack;

public class UnboundedStack<E> implements Stack<E>{

    private E[] UBStack;
    private int top = -1;


    public UnboundedStack(){
        this.UBStack = (E[])(new Object[10]);
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public void push(E element) {
        if(top == this.UBStack.length -1 ){
            E[] newUBStack = (E[]) new Object[this.UBStack.length * 2];
            for(int i =0; i <= top; i++){
                newUBStack[i] = this.UBStack[i];
            }
            this.UBStack = newUBStack;
        }
        this.UBStack[++top] = element;

    }

    @Override
    public E top() {
        return this.UBStack[top];
    }

    @Override
    public E pop() {
        E poppedElement =  this.UBStack[top];
        top--;
        return poppedElement;
    }
}
