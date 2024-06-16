import java.util.*;
class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		for(int i = 1; i<=rows; i++){
		int temp = rows;
			for(int space = 1; space<=rows-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=i*2-1; j++){
				System.out.print(temp+"  ");
			if(j<i) temp--;
			else temp++;
			}
			System.out.println();
		}
	}

}
