import java.io.*;
class p5{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(obj.readLine());
		int sixteen = 16;
		if(num%sixteen==0)
			System.out.println(num+" is present in the table of "+sixteen);
		else
			System.out.println(num+" is not present in the table of "+sixteen);
	}
}
