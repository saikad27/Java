class p9{

	public static void main(String[] args){

		int math = 93;
		int comp = 98;
		int eng = 91;
		int phy = 93;
		int chem = 94;
		
		int result = (math+comp+eng+phy+chem);
		if(math>34 && comp>34 && eng>34 && phy>34 && chem>34){

			switch(result/50){
				
				case 9:System.out.println("First class with distinction");
						break;
				case 8:System.out.println("First class with distinction");
                                                break;
				case 7:System.out.println("First class with distinction");
                                                break;
				case 6:System.out.println("First class");
						break;
				case 5:System.out.println("Second class");
						break;
				default:System.out.println("Pass");
			}
		
		}
		else{

			System.out.println("Fail");
		}
	}
}
