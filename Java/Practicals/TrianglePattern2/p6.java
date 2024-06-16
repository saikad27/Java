import java.io.*;
class p6{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		
		int row = Integer.parseInt(input.readLine());
		char ch = 'A';
		for(int i = 1;i<=row;i++){
			for(int j = 1; j<=i; j++){
					if(i%2==1){
						System.out.print(j +"  ");
					}
					else{

						System.out.print(ch+"  ");
					}
					ch++;
			}
			System.out.println();
		}
		
	}
}
