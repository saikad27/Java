/*
	Method Local Inner class : In a method local inner class an inner class is only accessible
	within the method.
*/
class Outer{
	Outer(){
		System.out.println("In constructor : Outer");
	}
	void fun(){
		System.out.println("In fun");
		class Inner{
			Inner(){
				System.out.println("In constructor : Inner");
			}
		}
		Inner obj = new Inner();
	}
	public static void main(String[] args){
		new Outer().fun();
	}
}
