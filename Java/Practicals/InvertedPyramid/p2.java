import java.util.*;
class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		int num = 1;
		for(int i = 1; i<=row; i++){
			for(int space = 1; space<=i-1 ;space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=(row-i+1)*2-1; j++){
				System.out.print(num+"  ");
				num++;
			}
			System.out.println();
		}
	}


}
