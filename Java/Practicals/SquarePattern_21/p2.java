/*	
	row=3		row=4
	
	9  4  25	4  25 18 7
	18 7  8		8  27 50 11
	27 50 11	36 13 14 45
			16 17 54 19
*/
import java.util.*;
class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=rows; j++){
				if(temp%3==0){
					System.out.print(temp*3+" ");
				}
				else if(temp%5==0){
					System.out.print(temp*5+" ");
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
