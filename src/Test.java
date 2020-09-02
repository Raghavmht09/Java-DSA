import java.util.Stack; 
class test{ 
  
 
    static void printStack(Stack<Integer> stack) 
    { 
        while (!stack.isEmpty()) 
            System.out.print(stack.pop() + " "); 
    } 
  

    static void OddEvenStack(Stack<Integer> stack) 
    { 
        Stack<Integer> temp = new Stack<>(); 
        Stack<Integer> temp1 = new Stack<>();
  
        while (!stack.isEmpty()) { 
            int val = stack.pop(); 
  
            if (val % 2 == 1) 
                temp.push(val); 
            
            else if(val % 2==0)
            	temp1.push(val);
        } 
 
        while (!temp.isEmpty()) 
            stack.push(temp.pop()); 
            stack.push(temp1.pop());
        
        printStack(stack); 
    } 
  
 
    public static void main(String[] args) 
    { 
        Stack<Integer> stack = new Stack<>(); 
        stack.push(16); 
        stack.push(15); 
        stack.push(29); 
        stack.push(24); 
        stack.push(19); 
  
       OddEvenStack(stack); 
    } 
} 
