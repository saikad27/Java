import java.util.*;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		for(int i = 1; i<=rows; i++){
		int temp = rows;
		char ch = 64;
		ch+=rows;
			for(int j = 1; j<=rows; j++){
				if(i%2==0){
					System.out.print(ch+"  ");
				}
				else{
					if(j%2==1) System.out.print(temp+"  ");
					else System.out.print(ch+"  ");
					
				}
				temp--;
				ch--;
			}
			System.out.println();
		
		}
	}
}
