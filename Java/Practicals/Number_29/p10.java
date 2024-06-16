import java.util.Scanner;
class p10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int rem;
		int count = 0;
		int sum = 0;
		for(int i = 1; temp!=0; i++){
			count++;
			temp/=10;
		}
		temp = num;
		for(int i = 1; temp!=0; i++){
			int product = 1;
			rem = temp%10;
			for(int j = 1; j<=count; j++ ){
				product = product*rem;
			}
			sum+=product;
			temp/=10;
		}
			if(sum==num) System.out.print(num+" is an Armstrong number");
			else System.out.print(num+" is not an Armstrong number");
		
	}
}
