import java.io.*;
class p2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of array : ");
		int arrSize = Integer.parseInt(br.readLine());
		int arr[] = new int[arrSize];
		System.out.println("Enter elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i<arr.length; i++){
                        System.out.println(arr[i]);
                }

	}
}
