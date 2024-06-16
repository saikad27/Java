/*	
	row=3		row=4
	
	C B A		D C B A
	3 3 3		4 4 4 4 
	C B A		D C B A
			4 4 4 4
*/
import java.util.*;
class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		int temp = rows;
		for(int i = 1; i<=rows; i++){
			char ch = 64;
			ch += rows;
			for(int j = 1; j<=rows; j++){
				if(i%2==1){
					System.out.print(ch+" ");
					ch--;
				}
				else{
					System.out.print(temp+" ");
				}

			}
			System.out.println();
		
		}
	}
}
