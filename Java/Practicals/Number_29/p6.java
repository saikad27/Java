import java.util.*;
class p6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp1 = 0;
		int temp2 = 1;
		int result = 0;
		for(int i = 1; i<=num; i++){
			System.out.print(result+",");
			result = temp1+temp2;	
			if(temp1==temp2){
				System.out.print(temp2+",");
			}
			if(temp1>temp2){
				temp2=temp1;
			}
			temp1 = result;
		}
	}
}
