import java.util.*;
class p5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		int num = row;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=row; j++){
				{if(i%2==1 && j%2==0) System.out.print("$  ");
				else System.out.print(num+"  ");}
				if(i%2==1 && j%2==1) num++;
				
			}System.out.println();
			if(row%2==1){num--;}
		}
	}

}
