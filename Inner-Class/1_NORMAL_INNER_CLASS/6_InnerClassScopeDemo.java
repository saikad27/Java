class Outer{
	int x = 10;
	static int y = 20;
	Outer(){
		System.out.println("In constructor : Outer");
	}
	class Inner{
		int x = 5;
		Inner(){
			System.out.println("In constructor : Inner");
		}
		void fun(){
			System.out.println(Outer.this.x);
			System.out.println(y);
		}
	}
	public static void main(String[] args){
		Outer outObj = new Outer();
		Inner inObj = outObj.new Inner();
		inObj.fun();
	}
}
