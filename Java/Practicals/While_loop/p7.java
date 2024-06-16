class p7{

	public static void main(String[] args){

		int num = 1872340798;
		int counter = num;
		int count = 0;
		while(counter!=0){

			counter = counter/10;
			count++;
		}
		System.out.println("Number of digits = "+count);
	}
}
