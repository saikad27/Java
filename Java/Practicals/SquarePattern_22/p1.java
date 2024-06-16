import java.util.*;
class p1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		char ch1 = 64;
		ch1+=row;
		char ch2 = 96;
		ch2+=row;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row; j++){
				{if(j==1) System.out.print(ch1+"  ");
				else System.out.print(ch2+"  ");}
				ch1++;
				ch2++;
				
			}System.out.println();
		}
	}

}
