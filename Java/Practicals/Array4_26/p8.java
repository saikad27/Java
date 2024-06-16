import java.util.Scanner;
class p8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		char[] arr = new char[size];
		System.out.println("Enter elements : ");
		int count = 0;
		int finalCount = 1;
		char repEle = '1';
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.next().charAt(0);
		}
		for(int i = 0; i<arr.length; i++){
			count = 0;
			for(int j = 0; j<arr.length; j++){
				if(arr[i]==arr[j]){
					count++;
					if(count>finalCount){
						finalCount = count;
						repEle = arr[i];
					}
				}
			}
			
		}
		if(finalCount>1) System.out.println(repEle+" occurs "+finalCount+" times in an array");
		else System.out.println("All elements occur exactly 1 time in an array");
	}
}
