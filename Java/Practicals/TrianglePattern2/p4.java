import java.io.*;
class p4{
	public static void main(String[] args)throws IOException{

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int row = Integer.parseInt(input.readLine());
		for(int i = 1;i<=row;i++){
			char ch1 = 96;
			ch1+=row;
			char ch2 = 64;
			ch2 +=row;
			for(int j = 1; j<=i; j++){
				if(i%2 ==1){
					System.out.print(ch1-- +"  ");
				}
				else{
					System.out.print(ch2-- +"  ");
				}
			}
			System.out.println();
		}
		
	}
}
