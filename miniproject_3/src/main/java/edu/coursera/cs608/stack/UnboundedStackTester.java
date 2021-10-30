package edu.coursera.cs608.stack;

public class UnboundedStackTester {

    public static UnboundedStack<Integer> initialize(int size){
        UnboundedStack<Integer> unboundedStack = new UnboundedStack();
        while (size > 0){
            unboundedStack.push(size);
            size--;
        }
        return  unboundedStack;
    }

    public static void testSize(Stack stack){
        int size = stack.size();
        System.out.println("Stack size is "+ size);
    }

    public static void testIsEmpty(Stack stack){
        System.out.println(" Stack Empty : "+ stack.isEmpty());
    }

    public  static  void testPush(Stack stack, Integer value){
        System.out.println("Pushing to stack : "+value);
        stack.push(value);
    }

    public static  void testTop(Stack stack){
        System.out.println("Top of the stack : "+ stack.top());
    }

    public  static  void testPop(Stack stack){
        System.out.println("Popping the top element : " + stack.pop());
    }

    public static void test(Stack stack ){
        testSize(stack);
        testIsEmpty(stack);
        testPush(stack, 100);
        testTop(stack);
        testPop(stack);
    }

    public  static  void main(String argsp[]){
        test(initialize(10));
    }
}
