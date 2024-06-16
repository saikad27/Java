import java.io.*;
class P8{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter total count of employees : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		System.out.println("Enter Employee's Age : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
	}

}
