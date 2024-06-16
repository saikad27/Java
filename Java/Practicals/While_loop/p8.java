class p8{

	public static void main(String[] args){

		int num = 1872340798;
		int counter = num;
		int count = 0;
		int rem;
		System.out.println("num : "+num);
		System.out.print("Odd digits : ");
		while(counter!=0){
			rem = counter%10;
			counter = counter/10;
			if(rem%2==1){
				System.out.print(rem+" ");
			}
		}
		System.out.println();
	}
}
