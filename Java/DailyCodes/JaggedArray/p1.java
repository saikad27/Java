import java.util.*;
class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		System.out.println("Enter the elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i]+",");
                }
	}
}
