import java.util.*;
class p9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row : ");
		int rows = sc.nextInt();
		for(int i = 1; i<=rows; i++){
		int temp = 1;
			for(int j = 1; j<=rows; j++){
				if((i+j)%2==0){
					System.out.print(temp*2+"  ");
				}
				else{
					System.out.print(temp*3+"  ");
					
				}
				temp++;
			}
			System.out.println();
		
		}
	}
}
