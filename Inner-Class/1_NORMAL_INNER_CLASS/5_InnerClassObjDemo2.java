class Outer{
	Outer(){
		System.out.println("In constructor-Outer");
	}
	class Inner{
		Inner(){
			System.out.println("In constructor-Inner");
		}
	}
}
class Demo{
	public static void main(String[] args){
		Outer.Inner inObj = new Outer().new Inner();
	}
}
