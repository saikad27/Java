import java.io.*;
class p10{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number : ");
		long num = Long.parseLong(br.readLine());
		long temp = num;
		long reverse = 0;
		while(temp!=0){
			reverse = reverse*10+(temp%10);
			temp/=10;	
		}
		System.out.println("Original : "+num);
		System.out.println("Reverse : "+reverse);
		temp = reverse;
		long rem = 0;
		while(temp!=0){
			rem = temp%10;
			temp/=10;
			if(rem%2==1){
				System.out.print(rem*rem+",");
			}
		}
	}
}
