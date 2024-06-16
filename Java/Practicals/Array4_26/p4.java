import java.util.Scanner;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements : ");
		int count = 0;
		int finalCount = 1;
		int repEle = 0;
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
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
		if(finalCount==2) System.out.println(repEle+" is repeated exactly two times.");
		else if(finalCount>2) System.out.println(repEle+" is repeated more than two times.");
		else System.out.println("No element is repeated");
	}
}
