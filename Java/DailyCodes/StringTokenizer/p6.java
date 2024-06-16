import java.io.*;
class p6{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name = input.readLine();
		System.out.print("Enter your Society name : ");
		String scname = input.readLine();
		System.out.print("Enter your wing : ");
		char wing = (char)input.read();
		System.out.println("Name : "+name);
		System.out.println("Society name : "+scname);
		System.out.println("Wing : "+wing);
		
	}

}
