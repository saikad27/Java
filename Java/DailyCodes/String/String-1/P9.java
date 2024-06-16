class P9{
	public static void main(String[] args){

		System.out.println("Following are the three ways to initialize a string in Java: ");
		
		//#way1
		String str1 = "Shashi";
		System.out.println(1+". String literal : "+str1);

		//#way2
		char[] arr = new char[]{'S','h','a','s','h','i'};
		System.out.println(2+". Character array : "+arr);

		//#way3
		String str2 = new String("Shashi");
		System.out.println(3+". String Object(new string) : "+str2);

	}
}
