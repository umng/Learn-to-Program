class MyCircularQueue {
    
    private int queue[];
    private int queueSize;
    private int head = -1;
    private int tail = -1;
    
    public static void main(String[] args) {
        
        // MyCircularQueue obj = new MyCircularQueue(6);  // set the size to be 6     
        // System.out.println(obj.enQueue(6));  // return true
        // System.out.println(obj.Rear());  // return 6
        // System.out.println(obj.Rear());  // return 6
        // System.out.println(obj.deQueue());  // return true
        // System.out.println(obj.enQueue(5));  // return true
        // System.out.println(obj.Rear());  // return 5
        // System.out.println(obj.deQueue());  // return true
        // System.out.println(obj.Front());  // return -1
        // System.out.println(obj.deQueue());  // return false
        // System.out.println(obj.deQueue());  // return false
        // System.out.println(obj.deQueue());  // return false
        
        
        
//         MyCircularQueue obj = new MyCircularQueue(2);  // set the size to be 2     
//         System.out.println(obj.enQueue(4));  // return true
//         System.out.println(obj.Rear());  // return 4
//         System.out.println(obj.enQueue(9));  // return true
//         System.out.println(obj.deQueue());  // return true
//         System.out.println(obj.Front());  // return 9
//         System.out.println(obj.deQueue());  // return true
//         System.out.println(obj.deQueue());  // return false
//         System.out.println(obj.isEmpty());  // return true
//         System.out.println(obj.deQueue());  // return false  
//         System.out.println(obj.enQueue(6));  // return true  
//         System.out.println(obj.enQueue(4));  // return true
        
        
        // MyCircularQueue obj = new MyCircularQueue(4);  // set the size to be 4
        // System.out.println(obj.enQueue(3));  // return true
        // System.out.println(obj.Front());  // return 3
        // System.out.println(obj.isFull());  // return false
        // System.out.println(obj.enQueue(7));  // return true
        // System.out.println(obj.enQueue(2));  // return true
        // System.out.println(obj.enQueue(5));  // return true
        // System.out.println(obj.deQueue());  // return true
        // System.out.println(obj.enQueue(4));  // return true
        // System.out.println(obj.enQueue(2));  // return false
        // System.out.println(obj.isEmpty());  // return false
        // System.out.println(obj.Rear());  // return 4
    }

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queueSize = k;
        queue = new int[queueSize];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()) {
            if(isEmpty()) {
                head = 0;
                tail = 0;
                queue[tail] = value;
            } else if(tail == queueSize-1) {
                tail = 0;
                queue[tail] = value;
            } else {
                tail += 1;
                queue[tail] = value;
            }
            return true;
        }
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()) {
            if(head == tail) {
                head = -1;
                tail = -1;
            } else if(head == queueSize-1) {
                queue[head] = -1;
                head = 0;
            } else {
                // head += 1;
                // queue[head] = -1;
                
                queue[head] = -1;
                head += 1;
            }
            return true;
        }
        return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty()) {
            return queue[head];
        }
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty()) {
            return queue[tail];
        }
        return -1;        
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(head == -1 || tail == -1) {
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(tail-head == queueSize-1 || head-tail == 1) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
