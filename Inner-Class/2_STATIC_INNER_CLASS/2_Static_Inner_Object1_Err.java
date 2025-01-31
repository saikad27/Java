class Outer{
	static class Inner{
		Inner(){
			System.out.println("In Constructor : Inner");
		}
	}
}
class Demo{
	public static void main(String[] args){
		Outer.Inner in = new Outer().new Inner();		
	}
}
