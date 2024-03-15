package nengboonchai.basic;

import java.util.Stack;

public class TestStack {
     // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }
     
    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
 
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
 
    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
     
    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
 
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
 
 
    public static void main (String[] args)
    {
        // last-in first-out
          // Default initialization of Stack
          Stack<Integer> stack1 = new Stack<Integer>();
          stack1.push(5);
          stack1.push(34);
          stack1.push(-99);
          System.out.println(stack1);
          // // Fetching the element at the head of the Stack
          System.out.println(stack1.peek());

          // get lastest element and remove it
          System.out.println(stack1.pop());

          System.out.println(stack1);

          Integer pos = (Integer) stack1.search(5);
         System.out.println(pos);
    }
}
