package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        System.out.println("STACK");
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Hilmi");
        stack.offerLast("Akbar");
        stack.offerLast("Muharrom");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());



        System.out.println();
        System.out.println("QUEUE");
        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Arief");
        queue.offerLast("Karditya");
        queue.offerLast("Hermawan");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
