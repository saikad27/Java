import java.util.*;
class p3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		int num = row;
		char ch = 96;
		ch+=row;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row; j++){
				{if((i+j)%2==1) System.out.print(num+"  ");
				else System.out.print(ch+"  ");}
				num++;
				ch++;
				
			}System.out.println();
		}
	}

}
