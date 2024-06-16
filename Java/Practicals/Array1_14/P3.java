import java.io.*;
class P3{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of an array : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.print("Even elements : ");
		for(int i=0;i<arr.length; i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+"  ");
			}
		}
	}
}
