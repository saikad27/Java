import java.util.*;
class sample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		for(int i = 0; i<rows; i++){
			for(int space = 0; space<=rows-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=(2*i+1); j++){
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
