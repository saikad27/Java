import java.util.*;
class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int rem = 0;
		int temp = num;
		int sum = 0;
		for(int i = 1; temp!=0 ; i++){
			int fact = 1;
			rem=temp%10;
			for(int j = 1; j<=rem; j++ ){
				fact = fact*j;
			}
			sum+=fact;
			temp/=10;
		}
		if(sum==num) System.out.println(num+" is a strong number");
		else System.out.println(num+" is not a strong number");
	}
}
