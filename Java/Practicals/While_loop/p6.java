class p6{

	public static void main(String[] args){

		int num = 9307;
		int rem;
		int cfact = num;
		while(cfact!=0){
			rem = cfact%10;
			cfact = cfact/10;
			System.out.println(rem);
			
		}
	}
}
