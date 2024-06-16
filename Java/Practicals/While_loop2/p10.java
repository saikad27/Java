class p10{

	public static void main(String[] args){

		int num = 234489;
		int dre = num;
		int rem;
		int sum = 0;
		int product = 1;
		System.out.println("Input :"+num);
		while(dre!=0){

			rem = dre%10;
			dre = dre/10;
			if(rem%2==0){
				product = rem*product;
				
			}
			else{     
                            
				sum = sum+rem;
                        }
		}
		System.out.print("Sum of odd digits : ");
		System.out.println(sum);
		System.out.print("Product of even digits : ");
		System.out.println(product);

	}
}
class p8{

        public static void main(String[] args){

                int num = 234489;
                int dre = num;
                int rem;
                int product = 1;
                System.out.println("Input :"+num);
                System.out.print("Products of odd digits : ");
                while(dre!=0){

                        rem = dre%10;
                        dre = dre/10;
                        if(rem%2!=1){
                                product = rem*product;
                        }
                }
                System.out.println(product);

        }
}

