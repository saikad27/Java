import java.io.*;
class p9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1; i<=row; i++){
		char ch = 64;
		ch+=row-i+1;
			for(int j = 1; j-1<=row-i; j++){
				if(i%2==1)
					System.out.print(j+"  ");
				else
					System.out.print(ch+"  ");
					ch--;
			}
			System.out.println();
		}
	}
}
