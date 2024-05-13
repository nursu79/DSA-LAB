package question3;

public class LinearQueue {

    private int[] stack1;
    private int[] stack2;
    private int top1, top2;

    public LinearQueue(int size) {
        stack1 = new int[size];
        stack2 = new int[size];
        top1 = -1;
        top2 = -1;
    }

    public void enqueue(int data) {
        if (top1 == stack1.length - 1) {
            System.out.println("Queue is full. Enqueue operation failed.");
            return;
        }
        stack1[++top1] = data;
        System.out.println(data );
    }

    public void dequeue() {
        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty. Dequeue operation failed.");
            return;
        }
        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }
        System.out.println(stack2[top2--] );
    }

    public void peek() {
        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue is empty. Peek operation failed.");
            return;
        }
        if (top2 == -1) {
            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }
        System.out.println("Front element: " + stack2[top2]);
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        queue.enqueue(45);
        queue.enqueue(67);
        queue.enqueue(65);
        queue.enqueue(22);
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
   
        queue.peek();
    }

}
