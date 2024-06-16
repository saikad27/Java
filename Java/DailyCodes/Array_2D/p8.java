import java.util.Scanner;
class p8{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = input.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element: ");
			arr[i] = input.nextInt();
		}
		System.out.print("Elements of array are : ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i!=arr.length-1){
				System.out.print(",");
			}

		}System.out.println();
	}
}
