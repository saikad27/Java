import java.util.*;
class p4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<num; i++){
			if(num%i==0){
				sum+=i;	
			}
		}
		if(num<sum)
			System.out.println(num+" is an Abundant number");
		else
			System.out.println(num+" is not an Abundant number");
	}
}
