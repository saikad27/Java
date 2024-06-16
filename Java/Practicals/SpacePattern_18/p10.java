import java.util.Scanner;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
			char ch = 64;
			ch+=i;
			for(int space = 1; space<i ; space++){
				System.out.print("   ");

			}
			for(int j = i; j<=row ;j++){
				if((j+row)%2==1)System.out.print((int)ch++ +" ");
				else System.out.print(ch++ +"  ");
			}
			System.out.println();
		}
	}

}
