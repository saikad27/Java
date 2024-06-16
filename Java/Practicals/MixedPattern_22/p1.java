import java.util.Scanner;
class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		int num = 1;
		for(int i = 1; i<=row; i++){
			for(int space = 1; space<=row-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=i; j++){
				System.out.print(num+"  ");
				num+=2;
			}
			System.out.println();	
		}
	}
}
