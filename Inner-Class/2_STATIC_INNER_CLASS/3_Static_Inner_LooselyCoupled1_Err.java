class Outer{
	int x = 10;
	static int y = 20;
	static class Inner{
		void fun(){
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args){
		Outer.Inner obj = new Outer.Inner();
		obj.fun();
	}
}
