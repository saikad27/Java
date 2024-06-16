import java.util.*;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		char ch = '$';
		int num = row*row;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row; j++){
				if(i==j){
					System.out.print(ch+"  ");
				}
				else{
					System.out.print(num*j+"  ");
				}
				num--;
				
			}
			System.out.println();
		}
	}

}
