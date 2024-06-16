/*	
	row=3		row=4
	
	9  4  5		16 5  6  7
	36 7  8		64 9  10 11
	81 10 11	144 13 14 15
			256 17 18 19
*/
import java.util.*;
class p3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=rows; j++){
				if(temp%rows==0){
					System.out.print(temp*temp+" ");
				}
				else{
					System.out.print(temp+" ");
				}
				temp++;

			}
			System.out.println();
		
		}
	}
}
