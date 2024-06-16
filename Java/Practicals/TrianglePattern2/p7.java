import java.io.*;
class p7{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		
		int row = Integer.parseInt(input.readLine());
		char ch = 'a';
		for(int i = 1;i<=row;i++){
			for(int j = 1; j<=i; j++){
					if(j%2==1){
						System.out.print(i +"  ");
					}
					else{

						System.out.print(ch++ +"  ");
					}
					
			}
			System.out.println();
		}
		
	}
}
