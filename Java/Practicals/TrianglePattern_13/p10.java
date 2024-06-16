import java.io.*;
class p10{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(br.readLine());
		int temp = row;
		for(int i = 1; i<=row; i++ ){
			char ch1 = 96;
			ch1+=row-i+1;
			char ch2 = 64;
			ch2+=row-i+1;
			for(int j = 1; j<=row-i+1; j++){
				if(temp%2==1){
					System.out.print(ch1);
				}
				else{
					System.out.print(ch2);
				}
				System.out.print("  ");
				ch1--;
				ch2--;
				
			}
			temp--;
			System.out.println();

		}

	}

}
