import java.util.*;
class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		int num = 1;
		for(int i = 1; i<=rows; i++){
			for(int space = 1; space<=rows-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=i*2-1; j++){
				System.out.print(num+"  ");
				
			}
			System.out.println();
		}
	}

}
