import java.io.*;
class p6{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(input.readLine());
		int temp = num,rev = 0;
		int rem;
		while(temp!=0){
			rem = temp%10;
			temp = temp/10;
			rev = rev*10+rem;
		}
		if(num==rev){
			System.out.println(num+" is a palindrome number.");
		}
		else{
			System.out.println(num+" is not a palindrome number.");
		}
	}
}
