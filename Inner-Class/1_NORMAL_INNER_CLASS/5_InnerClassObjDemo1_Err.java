class Outer{
	class Inner{
		Inner(){
			System.out.println("In constructor-Inner");
		}
	}
}
class Demo{
	public static void main(String[] args){
		Inner inObj = new Outer().new Inner();	//Object chaining
	}
}
