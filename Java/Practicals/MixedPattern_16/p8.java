import java.io.*;
class p8{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		char ch = 64;
		ch+=(row*(row+1)/2);
		for(int i = 1; i<=row; i++){
			for(int j = row; j>=i; j--){
				System.out.print(ch+"  ");
				ch--;
			}
			System.out.println();
		}
	}
}
