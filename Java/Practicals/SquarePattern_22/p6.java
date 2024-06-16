import java.util.*;
class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		for(int i = 1; i<=row; i++){
		int num = row*row;
			for(int j = 1; j<=row; j++){
				if(i%2==0 && j%2==0) num-=5;
				if(i%2==0) System.out.print(num+"  ");
				else System.out.print(num-j+1+"  ");
				
			}System.out.println();
		}
	}

}
