import java.util.*;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
			int temp = i;
			for(int space = 1; space<=row-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=(2*i)-1; j++){
				System.out.print(temp+"  ");
				if(j<i)temp--;
				else temp++;
			}
			
			System.out.println();

		}
	}

}
