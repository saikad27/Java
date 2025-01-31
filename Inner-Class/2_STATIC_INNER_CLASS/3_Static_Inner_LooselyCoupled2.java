/*
      Q.Why is static inner class often referred as a Loosely-coupled inner-class?
	
      1.Static inner classes can access static content of an Outer class
	but cannot access non-static content of that class,as they do not
	have any reference to the outer class object.
	
      2.We don't need outer class object to create an inner class object but
	we do need the outer class inorder access the inner class for creating 
	an inner class object
*/
class Outer{
	int x = 10;
	static int y = 20;
	static class Inner{
		void fun(){
			//System.out.println(x);	//Inner class does not have reference to Outer class object
			System.out.println(y);		//All members of a class can access a static content
		}
	}
	public static void main(String[] args){
		Outer.Inner obj = new Outer.Inner();
		obj.fun();
	}
}
