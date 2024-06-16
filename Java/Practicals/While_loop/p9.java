class p9{

	public static void main(String[] args){

		int num = 1872340798;
		int counter = num;
		int count_odd = 0;
		int count_even = 0;
		int rem;
		while(counter!=0){
			rem = counter%10;
			counter = counter/10;
			if(rem%2==1){
				count_odd++;
			}else{
				count_even++;
			}
		}
		System.out.println("num = "+num);
		System.out.println("Number of odd digits = "+count_odd);
		System.out.println("Number of even digits = "+count_even);
	}
}
