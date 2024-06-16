import java.io.*;
class p3{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of row : ");
		int row = Integer.parseInt(br.readLine());
		for(int i = 1; i<=row; i++){
			char ch = 64;
			ch+=row;
			int temp = 1;
			for(int j = 1; j<=row;j++){
				if(i%2==1) System.out.print(ch-- +"  ");
				else{System.out.print(temp++ +"  ");}
				
			}
			System.out.println();
		}
	}
}
