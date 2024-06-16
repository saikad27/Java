import java.io.*;
class p3{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(input.readLine());
		if(num%8==0)
			System.out.println(num+" is divisible by 8.");
		else
			System.out.println(num+" is not divisible by 8.");
	}
}
