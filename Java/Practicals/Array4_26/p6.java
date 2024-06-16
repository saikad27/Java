import java.util.Scanner;
class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		char[] arr = new char[size];
		int vowCount = 0,conCount = 0;
		System.out.println("Enter elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.next().charAt(0);
			if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u'){
				vowCount++;
			}
			else{
				conCount++;
			}
		}
		
			System.out.println("Count of vowels : "+vowCount);
	
			System.out.println("Count of consonants : "+conCount);
	}
}
