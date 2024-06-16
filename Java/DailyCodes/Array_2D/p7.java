import java.util.*;
class p7{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		int arr[] = new int[size];
		System.out.println("Size of the array: "+arr.length);
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i<arr.length; i++){
			
			arr[i] = input.nextInt();

		}
		System.out.println("Elements of the array are : ");
		for(int i = 0; i<arr.length; i++){

			System.out.println(arr[i]);
		}

	}

}
