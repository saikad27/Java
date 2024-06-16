/*	
	row=3		row=4
	
	A  4  A		4  A  6  A
	6  B  8		8  B  10 B
	C  10  C	12 C  14 C
			16 D  18 D
*/
import java.util.*;
class p7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1; i<=rows; i++){
		char ch = 64;
		ch+=i;
			for(int j = 1; j<=rows; j++){
				if(temp%2==1){
					System.out.print(ch+"  ");
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
