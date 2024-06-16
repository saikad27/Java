import java.util.Scanner;
class p3{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int row = input.nextInt();
		for(int i = 1;i<=row; i++){

			for(int j = 1; j<=row; j++){

					System.out.print(i+"  ");
				
			}
			System.out.println();
		}
		
	}
}
