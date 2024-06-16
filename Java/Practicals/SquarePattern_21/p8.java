import java.util.*;
class p8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		for(int i = 1; i<=rows; i++){
		char ch = 64;
		ch+=rows;
			for(int j = 1; j<=rows; j++){
				if((i+j)%2==0){
					System.out.print("#  ");
				}
				else{
					System.out.print(ch+"  ");
					ch--;
				}

			}
			System.out.println();
		
		}
	}
}
