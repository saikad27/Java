class Outer{
	class Inner{
		Inner(){
			System.out.println("In Constructor-Inner");
		}
	}
	public static void main(String[] args){
		Inner obj = new Inner();	
	}
}
