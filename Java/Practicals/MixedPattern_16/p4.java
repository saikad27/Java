import java.io.*;
class p4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		int temp = row;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(temp*j+"  ");
			}
			temp--;
			System.out.println();
		}
	}
}
