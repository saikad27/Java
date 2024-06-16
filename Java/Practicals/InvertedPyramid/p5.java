import java.util.*;
class p5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		char ch = 'A';
		for(int i = 1; i<=row; i++){
			
			for(int space = 1; space<i; space ++){
				System.out.print("   ");
			}
			for(int j = 1; j<=row*2-(i*2-1); j++ ){
				System.out.print(ch+"  ");
			}
			System.out.println();
			ch++;
		}
	}
}
