class Outer{
	class Inner1{
	
	}
	class Inner2{
		Inner2(){
			System.out.println("In constructor Inner - 2");
		}
	}
	public static void main(String[] args){
		Inner2 in2 = new Outer().new Inner2();
	}
}
