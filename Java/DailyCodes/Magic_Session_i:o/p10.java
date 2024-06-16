import java.io.*;
class p10{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter marks of four subjects: ");
		int sub1 = Integer.parseInt(obj.readLine());
		int sub2 = Integer.parseInt(obj.readLine());
		int sub3 = Integer.parseInt(obj.readLine());
		int sub4 = Integer.parseInt(obj.readLine());
		int total_obtained = sub1+sub2+sub3+sub4;
		int total = 400;
		System.out.println("Total marks obtained :"+total_obtained+" out of "+total);
	}
}
