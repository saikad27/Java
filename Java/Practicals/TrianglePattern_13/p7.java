import java.io.*;
class p7{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1; i<=row; i++ ){
			int num = row-i+1;
			char ch = 96;
			ch+=row-i+1;
			for(int j = 1; j<=row-i+1; j++){
				if(j%2==1){
					System.out.print(num);
				}
				else{
					System.out.print(ch);
				}
				System.out.print("  ");
				num--;
				ch--;
				
			}
			System.out.println();

		}

	}

}
