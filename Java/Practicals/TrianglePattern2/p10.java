import java.io.*;
class p10{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		
		int row = Integer.parseInt(input.readLine());
		char ch = 'a';
		int num = 1;
		for(int i = 1;i<=row;i++){
			for(int j = 1; j<=i; j++){
					if(i%2==1){
						System.out.print(num +"  ");
					}
					else{

						System.out.print(ch +"  ");
					}
					ch++;
					num++;
			}
			System.out.println();
		}
		
	}
}
