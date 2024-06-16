import java.io.*;
class p1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		int temp = 1;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row;j++){
				System.out.print(temp+"  ");
				temp++;
			}
			System.out.println();
		}
	}
}
