import java.io.*;
class p10{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name = br.readLine();
		System.out.print("Enter your Society name : ");
		String scname = br.readLine();
		System.out.print("Enter your Wing : ");
		char wing = (char)br.read();
		System.out.print("Enter your FlatNo : ");
		String flatNo = (br.readLine());
		System.out.println("Name : "+name);
		System.out.println("Society name : "+scname);
		System.out.println("Wing : "+wing);
		System.out.println("Flat no. : "+flatNo);
		
	}
}
