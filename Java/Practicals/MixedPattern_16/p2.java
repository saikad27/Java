import java.io.*;
class p2{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		char ch = 64;
		ch+=row;
		for(int i = 1; i<=row; i++){
			int temp = row+i-1;
			for(int j = 1; j<=row;j++){
				System.out.print(ch+""+temp+"  ");
				temp--;
			}
			System.out.println();
		}
	}
}
