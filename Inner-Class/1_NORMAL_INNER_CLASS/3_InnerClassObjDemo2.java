class Outer{
	class Inner{
		Inner(){
			System.out.println("In Constructor-Inner");
		}
	}
	public static void main(String[] args){
		Outer outObj = new Outer();
		Inner innerObj = outObj.new Inner();	
	}
}
