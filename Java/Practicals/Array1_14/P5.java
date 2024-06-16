import java.io.*;
class P5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of an array : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Elements less than 10 : ");
		for(int i=0;i<arr.length; i++){
			if(arr[i]<10){
				System.out.println(arr[i]+" is less than 10");
			}
		}
	}
}
