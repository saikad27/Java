import java.io.*;
class p3{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows : ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1; i<=row; i++){
			char ch = 65;
			ch+=row-i;
			for(int space = row; space>i; space--){
				System.out.print("   ");

			}
			for(int j = 1; j<i+1 ;j++){
				System.out.print(ch++ +"  ");

			}
			System.out.println();

		}
	}
}
