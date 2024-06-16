import java.util.Scanner;
class p9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		char[] arr = new char[size];
		System.out.println("Enter elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.next().charAt(0);
			if(arr[i] >= 97 && arr[i]<124){
				continue;
			}
			else{
				arr[i] = '#';
			}
				
		}
		System.out.print("Elements of array : ");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(",");	
		}
				System.out.println();	
		
	}
}
