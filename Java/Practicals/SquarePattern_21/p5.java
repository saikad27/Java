/*	
	row=3		row=4
	
	3  16  5		16  5  36  7
	36 7   64		64  9  100 11
	9  100 11		144 13 196 15
				256 17 324 19
*/
import java.util.*;
class p5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=rows; j++){
				if(temp%2==0){
					System.out.print(temp*temp+"  ");
				}
				else{
					System.out.print(temp+"  ");
				}
				temp++;

			}
			System.out.println();
		
		}
	}
}
