import java.io.*;
class p10{

	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int row = Integer.parseInt(input.readLine());
		for(int i = 1; i <= row; i++){
			char ch = 64;
			ch+=i;
			for(int j = 1; j<=row-i+1; j++){
				
				if((i+j+row)%2==0) System.out.print((int)ch +"  ");
				else System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();
		}
		
	}
}
