import java.util.Scanner;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		char[] arr = new char[size];
		System.out.println("Enter elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.next().charAt(0);
		}
		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		System.out.print("characters before "+ch+" in the array : ");
		for(int i = 0; i<arr.length; i++){
			if(arr[i]==ch){
				for(int j = 0; j<i; j++){
					System.out.print(arr[j]);
					if(j!=i-1)
					System.out.print(",");
				}
			}	
		}
				System.out.println();	
		
	}
}
