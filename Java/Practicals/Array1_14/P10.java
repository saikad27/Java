//For storing and maintaining a large set of data.
import java.util.Scanner;
class P10{
	static int search(int[] arr,int target){
		int start = 0;
		int end = arr.length;
		int mid = 0;
		int key = -1;
		int i = 0;
		while(end>=start){
			i++;
			mid = (start+end)/2;
			if(arr[mid]==target){
				key = mid;
				break;
			}
			else if(arr[mid]>target){
				end = mid-1;
			}
			else if(arr[mid]<target){
				start = mid+1;
			}
		}
		System.out.println("No of iterations : "+i);
		return key;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int target;
		int key;
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		while(true){
			System.out.print("Enter a element to search : ");
			target = sc.nextInt();
			key = search(arr,target);
	
			if(key==-1)
				System.out.println("No such element present.");
			else 
				System.out.println("Element found at index : "+key);
		}
	}
}
