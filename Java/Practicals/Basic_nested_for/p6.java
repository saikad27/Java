import java.util.Scanner;
class p6{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int row = input.nextInt();
	
		for(int i = 1;i<=row; i++){
			char ch = 'A';
			for(int j = 1; j<=row; j++){

				System.out.print(j+""+ch++ +"  ");
			}
			System.out.println();
		}
		
	}
}
