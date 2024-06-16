import java.io.*;
class p1{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows : ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1; i<=row; i++){
			int num = 1;
			for(int space = 1; space<=row-i; space++){

				System.out.print("   ");
			}
			for(int j = row; j>row-i; j--){
				
				System.out.print(num++ +"  ");

			}
			System.out.println();

		}	
	}
}
