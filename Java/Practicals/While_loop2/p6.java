class p6{

	public static void main(String[] args){

		int num = 234489;
		int dre = num;
		int rem;
		int product = 1;
		System.out.println("Input :"+num);
		System.out.print("Products of the digits : ");
		while(dre!=0){

			rem = dre%10;
			dre = dre/10;
			product = rem*product;
			
		}
		System.out.print(product);
	
	}
}
