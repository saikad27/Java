import java.util.Scanner;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
			char ch = 64;
			ch+=i;
			if(row%2==0){
				ch+=32;
			}
			for(int space = 1; space<i; space++){
				System.out.print("   ");
			}
			for(int j = row; j>=i; j--){
				System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();	
		}
	}
}
