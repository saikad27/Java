class p6{

	public static void main(String[] args){

		int num = 4;
		if(num<=5 && num>=0){

			switch(num){

				case 0:System.out.println("Zero");
					break;
				case 1:System.out.println("One");
                                        break;
				case 2:System.out.println("Two");
                                        break;
				case 3:System.out.println("Three");
					break;
				case 4:System.out.println("Four");
                                        break;
				case 5:System.out.println("Five");
					break;
			}
		}
		else if (num<0){
				System.out.println(num+" is a negative number");
		}
		else{
			System.out.println(num+" is greater than 5");
		}
	}
}
