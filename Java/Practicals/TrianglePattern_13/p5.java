import java.io.*;
class p5{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(obj.readLine());
		for(int i = 1; i<=row; i++){
			char ch1 = 'A',ch2 = 'a';
			for(int j = row-i+1; j>=1; j--){
				if(i%2==1)
					System.out.print(ch1++);
				else{
					System.out.print(ch2++);
				}
				System.out.print("  ");
		
			}
			System.out.println();
		}

	}

}
