import java.io.*;
class P4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of an array : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter elements : ");
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length; i++){
			if(arr[i]%2==1){
				sum = sum+arr[i];
			}
		}
		System.out.println("Sum of odd elements : "+sum);
	}
}
