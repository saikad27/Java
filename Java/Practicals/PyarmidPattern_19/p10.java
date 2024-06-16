import java.util.*;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		char ch1 = 64;
		ch1+=rows;
		for(int i = 1; i<=rows; i++){
			for(int space = 1; space<=rows-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=i*2-1; j++){
				System.out.print(ch1+"  ");
				if(j<i){
					ch1++;
				}
				else{
					ch1--;
				}
			}
			System.out.println();
		}
	}

}
