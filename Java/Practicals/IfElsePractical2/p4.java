class p4{

	public static void main(String[] args){

		int percent = 80;
		String career;
		if(percent>=85){	
			career = "Medical";
		}
		else if(percent>=75 && percent<85){
			career = "Engineering";
		}
		else if(percent<75 && percent>=65){
			career = "Bachelors in Science";
		}
		else if(percent<65 && percent>=55){
			career = "Pharmacy";
		}
		else{
			career = "Better luck try next year";
		}
		System.out.println(career);
		
	}
}
