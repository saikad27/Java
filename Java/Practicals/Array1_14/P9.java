import java.io.*;
class P9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Odd indexed elements : ");
		for(int i=0;i<arr.length; i++){
			if(i%2==1){
				System.out.println(arr[i]+" is an odd indexed element");
			}
		}
	}
}
