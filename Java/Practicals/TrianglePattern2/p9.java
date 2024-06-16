import java.io.*;
class p9{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		
		int row = Integer.parseInt(input.readLine());
		char ch = 'a';
		
		for(int i = 1;i<=row;i++){
			int num = row+1;
			for(int j = 1; j<=i; j++){
					if(j%2==1){
						System.out.print(num +"  ");
					}
					else{

						System.out.print(ch++ +"  ");
					}
					
					num++;
			}
			System.out.println();
		}
		
	}
}
