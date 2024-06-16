class p7{

	public static void main(String[] args){

		int num = 234489;
		int dre = num;
		int rem;
		int sum = 0;
		System.out.println("Input :"+num);
		System.out.print("Sum of even digits : ");
		while(dre!=0){

			rem = dre%10;
			dre = dre/10;
			if(rem%2==0){

				sum = sum+rem;
			}
		}System.out.println(sum);
	
	}
}
