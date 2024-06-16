import java.io.*;
class p5{

	public static void main(String[] args)throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int row = Integer.parseInt(input.readLine());
		for(int i = 1;i<=row;i++){
			
			for(int j = 1;j<=i;j++){

				System.out.print(i*j +"  ");
			}
			System.out.println();
		}
		
	}
}
