import java.io.*;
class p1{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		int num = Integer.parseInt(br.readLine());
		if(num%2==1)
			System.out.println(num+" is an odd number.");
		else
			System.out.println(num+" is an even number.");
}
}
