import java.util.Scanner;
class p8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
			int num = i ;
			for(int space = 1; space<i ; space++){
				System.out.print("   ");

			}
			for(int j = row; j>=i ;j--){
				System.out.print(num+"  ");
			num++;
			}
			System.out.println();
		}
	}

}
