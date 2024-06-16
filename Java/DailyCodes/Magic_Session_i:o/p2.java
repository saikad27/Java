import java.io.*;
class p2{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your age : ");
		int age = Integer.parseInt(br.readLine());
		if(age<0){
			System.out.println("Invalid age.\nAge cannot be negative.");
			System.exit(0);
		}
		else if(age>=18){
			System.out.println("You are eligible for voting.");
		}
		else System.out.print("You are not eligible for voting.");	
	}
}
