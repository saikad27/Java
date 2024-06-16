import java.util.Scanner;
class p5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] revArr = new int[size];
		System.out.println("Enter elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++){
			revArr[i] = arr[arr.length-(i+1)];
		}
		System.out.print("Reversed Elements : ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(revArr[i]);
			if(i!=arr.length-1)
				System.out.print(",");
		}System.out.println();
	}
}
