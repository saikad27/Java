import java.io.*;
class p10{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(input.readLine());
		for(int i = 1; i<=row; i++){
			int num = i;
			for(int j = 1; j<=row; j++){
				System.out.print(num+"  ");
				if(num<10){System.out.print(" ");}
				num++;
			}
			System.out.println();
		}
	}

}
