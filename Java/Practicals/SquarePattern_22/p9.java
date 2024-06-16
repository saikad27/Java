import java.util.*;
class p9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		char ch = '@';
		for(int i = 1; i<=row; i++){
		int num = row*row;
		if(row%2==1 && (i!=1 && i!=row)){
			num+=(row*1);
		}	
		else if(row%2==0 && (i!=1 && i!=row)) {
			num+=(row*2);
		}
			for(int j = 1; j<=row; j++){
				if(j%2==1){
					System.out.print(num+"  ");
				}
				else{
					System.out.print(ch+"  ");
				}
				num-=i;
				
			}
			System.out.println();
		}
	}

}
