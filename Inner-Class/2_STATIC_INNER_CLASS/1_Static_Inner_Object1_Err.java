class Outer{
	static class Inner{
		Inner(){
			System.out.println("In constructor : Inner");
		}
	}
	public static void main(String[] args){
		Inner in = new Outer().new Inner();
	}
}
