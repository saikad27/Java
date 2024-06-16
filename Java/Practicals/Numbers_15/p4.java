import java.io.*;
class p4{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(input.readLine());
		int fact = 1,temp = 1;
		while(temp<=num){
			fact = fact*temp;
			temp++;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	
	}
}
