import java.io.*;
class p2{
	public static void main(String[] args)throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name = input.readLine();
		input.close();
		System.out.print("Enter your Society name : ");
		String scname = input.readLine();
		System.out.print("Enter your Wing : ");
		String ch = input.readLine();
		System.out.print("Enter flatNo : ");
		String flatNo = input.readLine();
	}
}
