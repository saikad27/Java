/*	
	row=3		         row=4
	
	9  4  25		4  25  6  49
	6  49 8			8  81  10  121
	81 10 121		12  169  14  225 
				16  289  18  361
*/
import java.util.*;
class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=rows; j++){
				if(temp%2==1){
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
