import java.io.*;
class p1{
	public static void main(String[] args)throws IOException{
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a number: ");
	int row = Integer.parseInt(obj.readLine());
	for(int i = 1; i<=row; i++){
		int temp = i;
		for(int j = row-i+1; j>=1; j--){
			System.out.print(temp++ +" ");
		}
		System.out.println();
	
	}
}
}
