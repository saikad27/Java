/*
	Remember : An inner class object can only be created through an outer class object. 
*/

class Outer{
	class Inner1{
		Inner1(){
			System.out.println("In constructor : Inner1");
		}
		class Inner2{
			Inner2(){
				System.out.println("In constructor : Inner2");
			}
		}
	}
	public static void main(String[] args){
		
		//All four ways to create Inner2 object
	
		//1
		Inner1.Inner2 in2Obj = new Outer().new Inner1().new Inner2(); 
		
		//2	
		Outer o = new Outer();
		Inner1.Inner2 i2 = o.new Inner1().new Inner2();
		
		//3
		Inner1 inner1 = new Outer().new Inner1();
		Inner1.Inner2 inner2 = inner1.new Inner2(); 
		
		//4
		Outer out = new Outer();
		Inner1 in1 = out.new Inner1();
		Inner1.Inner2 in2 = in1.new Inner2();
	}
}
