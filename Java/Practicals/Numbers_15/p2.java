import java.io.*;
num%tempclass p2{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		int num = Integer.parseInt(input.readLine());
		int count = 0;
		int temp = 1;
		while(temp<=num){
			if(num%temp==0){
				count++;
			}
			temp++;
		}
		if(count==2){
			System.out.println(num+" is a prime number.");
		}
		else{
			System.out.println(num+" is not a prime number.");
		}
	}
}
