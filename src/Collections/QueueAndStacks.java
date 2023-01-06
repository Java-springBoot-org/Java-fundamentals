package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueAndStacks {
    public static void main(String[] args) {
        //FIFO QUEUE
        Queue<String> q = new ArrayDeque<>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.println(q.peek()); // first
        System.out.println(q.peek()); // first
        System.out.println(q.poll()); // first,

        System.out.println(q.peek()); // second
        System.out.println(q.poll()); // second
        System.out.println(q.poll()); // third

        System.out.println(q.isEmpty()); // true

        //LIFO DEQUEUE
        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pollLast()); // third
        System.out.println(stack.pollLast()); // second
        System.out.println(stack.pollLast()); // first

        System.out.println(stack.pollLast()); // null


    }
}
