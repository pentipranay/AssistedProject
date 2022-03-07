//Write a program to demonstrate working of a queue.
package assistedProjects;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_30 {
public static void main(String[] args) {
		      Queue<Integer> q = new LinkedList<>();
		      q.add(1);
		      q.add(4);
		      q.add(3);
		      q.add(2);
		      q.add(1);
		      System.out.println("The queue is: " + q);
		      int num1 = q.remove();
		System.out.println("one element deleted from the head is: " + num1);
		System.out.println(" queue after deletion is: " + q);
		int head = q.peek();
		System.out.println("head of the queue is: " + head);
		int size = q.size();
		System.out.println(" size of the queue is: " + size);
		}
}
