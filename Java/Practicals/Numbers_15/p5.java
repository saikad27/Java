import java.io.*;
class p5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		int temp = num,rev = 0;
		int rem;
 		while(temp!=0){
			rem = temp%10;
			temp = temp/10;
			rev = rev*10+rem;
		}
		System.out.println("Reverse of "+num+" is : "+rev);
	}
}
