import java.util.Scanner;
class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements : ");
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		int avg =sum/arr.length; 
		System.out.println("Average of all the elements : "+avg);
	}
}
