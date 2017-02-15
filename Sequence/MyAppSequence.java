public class MyAppSequence {
    
    public static void main(String[] args){
        
        Stack stack = new Stack();
        Queue queue = new Queue();

        System.out.println("Stack size: " + stack.size());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Peek element: " + stack.peek());
        
        System.out.println();
        
        System.out.println("Queue size: " + queue.size());
        System.out.println("Pop element: " + queue.pop());
        System.out.println("Peek element: " + queue.peek());
        
    }
    
}