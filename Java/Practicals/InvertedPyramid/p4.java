import java.util.*;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
			int num = 1;
			for(int space = 1; space<i; space ++){
				System.out.print("   ");
			}
			for(int j = 1; j<=row*2-(i*2-1); j++ ){
				System.out.print(num+"  ");
				num++;
			}
			System.out.println();
		}
	}
}
