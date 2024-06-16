class p2{

	public static void main(String[] args){

		int num = 2349876;
		int rem;
		int red = num;
		System.out.println("Input: "+num);
		System.out.print("Square of odd digits : ");
		while(red!=0){
	
				rem = red%10;
				red = red/10;
				if(rem%2==1){
					System.out.print(rem*rem+" ");
				}		
			}
		}
	}

