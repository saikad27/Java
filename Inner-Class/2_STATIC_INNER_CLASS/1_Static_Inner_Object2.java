class Outer{
	static class Inner{
		Inner(){
			System.out.println("In inner constructor");
		}
	}
	public static void main(String[] args){
		Inner obj = new Inner();
	}
}
