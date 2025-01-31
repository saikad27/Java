class Demo{
	
	Demo(){
		this("Sai");
		System.out.println("Constructor 1");
		System.out.println(this);
	}
	Demo(String str){
		System.out.println("Constructor 2");
		System.out.println(this);
	}
	public static void main(String[] args){
		Demo obj = new Demo();
	}
}
