import java.util.*;

class ArrayList1 extends ArrayList{
	public static void main(String[] args){
		ArrayList1 al = new ArrayList1();
		al.add(10);
		al.add("sai");
		al.add(30);
		al.add("kad");
		al.add(50);
		
		//Prints all the elements in the ArrayList
		System.out.println(al);		
		
		//returns size
		System.out.println(al.size());	
		
		//returns element at index 3
		System.out.println(al.get(3));

		//add() method : adding element at a location
		al.add(1,20);	
		System.out.println(al);
		
		//set() method : setting or updating the value of the element at a location
		System.out.println(al.set(4,40));
		System.out.println(al);

		//remove() method : removing an element at given index
		al.remove(2);	
		System.out.println(al);

		//removeRange() method
		al.removeRange(2,4);
		System.out.println(al);
		
		al.add(2);
		al.add(25);
		al.add(30);

		System.out.println(al);

		//sort
		Collections.sort(al);
		System.out.println(al);
		
		//binarysearch()
		System.out.println(Collections.binarySearch(al,25));

	}
}
