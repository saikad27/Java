import java.io.*;
class p4{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(obj.readLine());
		int table;
		for(int i = 1; i<=10; i++){
			table = num*i;
			System.out.println(num+" x "+i+" = "+table);
		}
	}
}
