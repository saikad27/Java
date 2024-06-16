import java.util.Scanner;
class p12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter your Society name : ");
		String socName = sc.next();
		System.out.print("Enter your Wing : ");
		char wing = sc.next().charAt(0);
		System.out.print("Enter your FlatNo. : ");
		int flatNo = sc.nextInt();
		System.out.print("Name : "+name);
		System.out.println("Society name : "+socName);
		System.out.println("Wing : "+wing);
		System.out.println("Flat No. : "+flatNo);

	}
}
