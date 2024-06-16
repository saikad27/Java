import java.io.*;
class p5{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int row = Integer.parseInt(input.readLine());
			char ch = 64;
			ch+=row+1;
		for(int i = 1;i<=row;i++){
			for(int j = 1; j<=i; j++){
				
					System.out.print(ch++ +"  ");
			}
			System.out.println();
		}
		
	}
}
