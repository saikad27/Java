import java.io.*;
class p8{

	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//BufferReader input = new BufferReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int row = Integer.parseInt(br.readLine());
		int num = 1;
		for(int i = 1;i<=row; i++){
			char ch = 64;
			ch+=row;
			for(int j = 1; j<=row; j++){

				System.out.print(ch+""+num++ +"  ");
			}
			System.out.println();
		}
		
	}
}
