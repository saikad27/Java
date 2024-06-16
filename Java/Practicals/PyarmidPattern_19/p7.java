import java.util.*;
class p7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		int temp = 1;
		char ch = 'A';
		for(int i = 1; i<=rows; i++){
			for(int space = 1; space<=rows-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=i*2-1; j++){
			if(i%2==1) System.out.print(temp+"  ");
			else System.out.print(ch+"  ");
			}
			temp++;
			ch++;
			System.out.println();
		}
	}

}
