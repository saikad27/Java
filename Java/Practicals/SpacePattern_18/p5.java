import java.io.*;
class p5{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows : ");
		int row = Integer.parseInt(br.readLine());
			int num = 1;
		for(int i = 1; i<=row; i++){
			for(int space = row; space>i; space--){
				System.out.print("   ");

			}
			for(int j = 1; j<i+1 ;j++){
				System.out.print(num*j +" ");
				if(num*j<10){
					System.out.print(" ");
				}

			}
				num++;
			System.out.println();

		}
	}
}
