import java.io.*;
class p7{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		int temp = 2;
		for(int i = 1; i<=row; i++){
			for(int j = row; j>=i; j--){
				System.out.print(temp+"  ");
				if(temp<10){System.out.print(" ");}
				temp+=2;
			}
			System.out.println();
		}
	}
}
