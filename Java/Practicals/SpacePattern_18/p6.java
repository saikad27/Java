import java.util.Scanner;
class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
			int num = row;
		for(int i = 1; i<=row; i++){
			for(int space = row; space-1>row-i ; space--){
				System.out.print("   ");

			}
			for(int j = 1; j-1<=row-i ;j++){
				System.out.print(num+"  ");

			}
			num--;
			System.out.println();
		}
	}

}
