import java.io.*;
class sample{
	public static void main(String[] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(obj.readLine());
		int temp = ((row+1)*row)/2;
		for(int i = 1; i<=row; i++){
			for(int j = row-i+1; j>=1; j--){
				System.out.print(temp+" ");
				if(temp<10){
					System.out.print(" ");
				}
				temp--;

			}
			System.out.println();
		}

	}
}
