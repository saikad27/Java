import java.util.*;
class LinkedList1{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.push(100);
		ll.push("Sai");	
		ll.push(28.9);	
		ll.push(44.7f);	
		ll.push(true);	
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println("First element : "+ll.peekFirst()+"\nLast element : "+ll.peekLast());
		ll.poll();
		System.out.println(ll);
	}
}
