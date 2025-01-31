class Outer{
	class Inner{
		static int x;
	}
	public static void main(String[] args){
		Inner obj1 = new Outer().new Inner();
		Inner obj2 = new Outer().new Inner();
		System.out.println(obj2.x);
		obj1.x = 20;
		System.out.println(obj2.x);
	}
}
