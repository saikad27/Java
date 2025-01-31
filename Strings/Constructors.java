class Constructors{
	
	void method1(){
		String str1 = new String();
		System.out.println("Constructor 1 : String()");	
		System.out.println("String 1 : "+str1);
	}
	void method2(){
		String str2 = new String("String");
		System.out.println("Constructor 2 : String(String original)");
		System.out.println("String 2 : "+str2);
	}
	void method3(){
		char[] arr = new char[]{'S','t','r','i','n','g'};
		String str3 = new String(arr);
		System.out.println("Constructor 3 : String(char value[])");
		System.out.println("String 3 : "+str3);
	}
	void method4(){
		char[] arr = new char[]{'S','t','r','i','n','g'};
		String str4 = new String(arr,2,4);
		System.out.println("Constructor 4 : String(char value[],int offset,int count)");
		System.out.println("String 4 : "+str4);
	}
	void method5(){
		int[] arr = new int[]{65,66,67,68};
		String str5 = new String(arr,0,4);
		System.out.println("Constructor 5 : String(int[] codePoints,int offset,int count )");
		System.out.println("String 5 : "+str5);
	}
	public static void main(String[] args){
		Constructors obj = new Constructors();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
	}

}
