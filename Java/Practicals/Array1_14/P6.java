import java.io.*;
class P6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size of an array : ");
		int n = Integer.parseInt(br.readLine());
		char[] arr = new char[n];
		System.out.println("Enter elements : ");
		for(int i=0; i<arr.length;i++){
			arr[i] = (char)br.read();
			br.skip(1);
		}
		System.out.print("Elements : ");
		for(int i=0;i<arr.length; i++){
				System.out.print(arr[i]+",");
		}
	}
}
