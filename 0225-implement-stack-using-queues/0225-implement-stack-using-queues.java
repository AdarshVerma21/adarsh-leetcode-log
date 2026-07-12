import java.util.Queue;
import java.util.LinkedList;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Time: O(n) | Space: O(1)
    public void push(int x) {
        // Add new element to helper queue
        q1.offer(x);
        
        // Transfer all existing elements from main queue to helper
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        
        // Swap: q2 becomes the queue with newest element at front
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    // Time: O(1) | Space: O(1)
    public int pop() {
        return q2.poll();
    }
    
    // Time: O(1) | Space: O(1)
    public int top() {
        return q2.peek();
    }
    
    // Time: O(1) | Space: O(1)
    public boolean empty() {
        return q2.isEmpty();
    }
}

