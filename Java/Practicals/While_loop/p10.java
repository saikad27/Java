class p10{

	public static void main(String[] args){

		int num = 12345;
		int counter = num;
		int sum = 0;
		int rem;
		while(counter!=0){
			rem = counter%10;
			counter = counter/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits in "+num+" is "+sum);
	}
}
