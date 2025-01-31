class Outer{
	static class Inner{
		int x = 10;
		int y = 20;
		public static void main(String[] args){
			System.out.println("Inside a static context");
		}
	}
	public static void main(String[] args){
		System.out.println("Inside main : Outer");
		Inner.main(args);
		System.out.println(Inner.x);
		System.out.println(Inner.y);
	}
}
