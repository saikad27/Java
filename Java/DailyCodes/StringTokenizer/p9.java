import java.io.*;
class p9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name = br.readLine();
		System.out.print("Enter your society name : ");
		String socName = br.readLine();
		System.out.print("Enter your flat No. : ");
		int flat = Integer.parseInt(br.readLine());
		System.out.print("Enter your wing : ");
		char wing = (char)br.read();
		System.out.println("Name : "+name);
		System.out.println("Society name : "+socName);
		System.out.println("FlatNo : "+flat);
		System.out.println("Wing : "+wing);

	}
}
