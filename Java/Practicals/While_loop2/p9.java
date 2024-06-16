class p9{

	public static void main(String[] args){

		int num = 234489;
		int dre = num;
		int rem;
		int square = 1;
		int sum = 0;
		System.out.println("Input :"+num);
		System.out.print("Sum of square of odd digits : ");
		while(dre!=0){

			rem = dre%10;
			dre = dre/10;
			if(rem%2!=0){
				square = rem*rem;
				sum = sum+square;
			}
		}
		System.out.println(sum);
	
	}
}
