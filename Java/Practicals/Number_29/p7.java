import java.util.*;
class p7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int rem;
		for(int i = 1; temp!=0; i++){
			rem = temp%10;
			sum = sum+rem*rem;
			temp/=10;
		}
		if(sum==1)
		System.out.print("Happy number");
		else 
		System.out.print("Sad number");
	}
}
