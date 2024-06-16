import java.util.*;
class p9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();
		for(int i = 1; i<=rows; i++){
		char ch2 = 'a';
		char ch1 = 'A';
			for(int space = 1; space<=rows-i; space++){
				System.out.print("   ");
			}
			for(int j = 1; j<=i*2-1; j++){
			if(i%2==1) System.out.print(ch1+"  ");
			else System.out.print(ch2+"  ");
			if(j<i){
				ch1++;
				ch2++;
			}
			else{
				ch1--;
				ch2--;
			}
			}
			System.out.println();
		}
	}

}
