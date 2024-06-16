import java.io.*;
class p6{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1; i<=row; i++){
			int temp = row;
			char ch = 96;
			ch+=row;
			for(int j = 1; j<=i; j++){
				if(i%2==0) System.out.print(temp+"  ");
				else{System.out.print(ch+"  ");}
				ch--;
				temp--;
			}
			System.out.println();
		}
	}
}
