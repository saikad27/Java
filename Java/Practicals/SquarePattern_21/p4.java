/*	
	row=3		row=4
	
	C  4  5		D  5  6  7
	F  7  8		H  9  10 11
	I  10 11	L  13 14 15
			P  17 18 19
*/
import java.util.*;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		char ch = 64;
		ch+=rows;
		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=rows; j++){
				if(temp%rows==0){
					System.out.print(ch+"  ");
				}
				else{
					System.out.print(temp+"  ");
				}
				ch++;
				temp++;

			}
			System.out.println();
		
		}
	}
}
