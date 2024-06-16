import java.util.Scanner;
class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements : ");
		int min,max;
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			
		}
		min = arr[0];
		max = arr[1];
		for(int i = 0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Difference between minimum and maximum element : "+(max-min));
	}
}
