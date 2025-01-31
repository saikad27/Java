interface Demo1{
	public default void fun(){
		System.out.println("In fun - Interface");
	}
}
class Demo2{
	public void fun(){
		System.out.println("In fun - Class");
	}
}

class Program1 extends Demo2 implements Demo1{
	public static void main(String[] args){
		Program1 obj = new Program1();
		obj.fun();
	}
}
