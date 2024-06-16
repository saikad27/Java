import java.io.*;
class p9{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(input.readLine());
		int num = 1;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row; j++){
				System.out.print(num+"  ");
				if(num<10){System.out.print(" ");}
				if(j!=row){num++;}
			}
			System.out.println();
		}
	}

}
