import java.io.*;
class P2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("Array elements : ");
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}

}
