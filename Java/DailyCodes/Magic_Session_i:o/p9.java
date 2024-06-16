import java.io.*;
class p9{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a starting number of the range: ");
		int num1 = Integer.parseInt(obj.readLine());
		System.out.print("Enter a last number of the range: ");
		int num2 = Integer.parseInt(obj.readLine());
		for(int i = num1; i<=num2; i++){
			if(i%2==1){
				System.out.print(i+",");
			}
		}
	}
}
