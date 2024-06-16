import java.util.Scanner;
class p3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements : ");
		int max1,max2;
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			
		}
		max1 = arr[0];
		max2 = arr[1];
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>max1){
				max1 = arr[i];
			}
			else{
				if(arr[i]>max2)
					max2 = arr[i];
			}
		
		}
		System.out.println("Second largest element : "+max2);
	}
}
