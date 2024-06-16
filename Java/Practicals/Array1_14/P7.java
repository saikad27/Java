import java.io.*;
class P7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Array elements divisible by 4: ");
		for(int i=0; i<arr.length;i++){
			if(arr[i]%4==0)
				System.out.println(arr[i]+" is divisible by 4 and its index is "+i);
		}
	}

}
