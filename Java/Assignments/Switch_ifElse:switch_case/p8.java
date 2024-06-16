class p8{

	public static void main(String[] args){

		int num1 = -7;
		int num2 = 5;
	
		if(num1>=0 && num2>=0){
			int result = num1*num2;
			int verify = result%2;
			switch(verify){

				case 0:System.out.println(result+" is Even");
					break;
				default:System.out.println(result+" is Odd");
					break;
			}
		}
		else System.out.println("Sorry negative number is not allowed");
	}
}
