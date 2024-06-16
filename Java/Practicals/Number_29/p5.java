import java.util.*;
class p5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int rem1 = 0;
		int rem2 = 0;
		int temp1 = num;
		int temp2 = num*num;
		int count1 = 0;
		int count2 = 0;
		for(int i = 1; temp1!=0; i++){
			rem1 = temp1%10;
			rem2 = temp2%10;
			if(rem1==rem2){
				count1++;
			}
			temp1/=10;
			temp2/=10;
			count2++;
		}
		if(count1==count2){
			System.out.println("Automorphic number");
		}
		else{
			System.out.println("Not an Automorphic number");
		}
	}
}
