import java.io.*;
class p4{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name = br.readLine();
		System.out.print("Enter your Society name : ");
		String scname = br.readLine();
		System.out.print("Enter your Wing : ");
		char wing = br.readLine();
		System.out.print("Enter your FlatNo : ");
		int flatNo = br.readLine();
	}
}
