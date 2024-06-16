class p4{

	public static void main(String[] args){

		float percent = 80f;
		
		if(percent>=70){	
			System.out.println("First class with distinction");
		}
		else if(percent>=60){
			System.out.println("First class");
		}
		else if(percent>=50){
			System.out.println("Second class");
		}
		else if(percent<=40){
			System.out.println("Pass");
		}
		else{
			System.out.println("fail");
		}
		
	}
}
