import java.util.Scanner;
class p9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
			char ch = 64;
			ch+=row;
			for(int space = 1; space<i ; space++){
				System.out.print("   ");

			}
			for(int j = row; j>=i ;j--){
				System.out.print(ch-- +"  ");
			}
			System.out.println();
		}
	}

}
